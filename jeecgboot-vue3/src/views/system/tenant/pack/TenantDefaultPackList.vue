<template>
  <div>
    <BasicTable @register="registerTable" :rowSelection="rowSelection">
      <template #tableTitle>
        <a-button preIcon="ant-design:user-add-outlined" type="primary" @click="handleAdd">+ 默认套餐
        </a-button>
        <a-button
          v-if="selectedRowKeys.length > 0"
          preIcon="ant-design:delete-outlined"
          type="primary"
          @click="handlePackBatch"
          style="margin-right: 5px"
        >批量删除
        </a-button>
      </template>
      <template #action="{ record }">
        <TableAction :actions="getActions(record)" />
      </template>
    </BasicTable>
    <!--  套餐包  -->
    <TenantPackMenuModal @register="registerPackMenuModal" @success="handleSuccess"/>
  </div>
</template>
<script lang="ts" name="tenant-default-pack" setup>
  import { ref, unref } from 'vue';
  import { BasicTable, TableAction } from '/@/components/Table';
  import { useModal } from '/@/components/Modal';
  import { deleteTenantPack, packList } from '../tenant.api';
  import { defalutPackColumns, defaultPackFormSchema } from "../tenant.data";
  import TenantPackMenuModal from './TenantPackMenuModal.vue';
  import { useMessage } from '/@/hooks/web/useMessage';
  import { useListPage } from '/@/hooks/system/useListPage';
  import { useUserStore } from '/@/store/modules/user';
  import {Modal} from "ant-design-vue";

  const { createMessage } = useMessage();
  const [registerModal, { openModal }] = useModal();
  const [registerPackMenuModal, { openModal: packModal }] = useModal();
  const userStore = useUserStore();

  // 列表页面公共参数、方法
  const { prefixCls, tableContext } = useListPage({
    designScope: 'tenant-template',
    tableProps: {
      api: packList,
      columns: defalutPackColumns,
      formConfig: {
        schemas: defaultPackFormSchema,
      },
      beforeFetch: (params) => {
        return Object.assign(params, { packType: 'default' });
      },
    },
  });
  const [registerTable, { reload }, { rowSelection, selectedRowKeys, selectedRows }] = tableContext;

  /**
   * 操作列定义
   * @param record
   */
  function getActions(record) {
    return [
      {
        label: '编辑',
        onClick: handleEdit.bind(null, record),
      },
      {
        label: '删除',
        popConfirm: {
          title: '是否确认删除租户套餐包',
          confirm: handleDelete.bind(null, record.id),
        },
      },
    ];
  }

  /**
   * 编辑套餐包
   */ 
  function handleAdd() {
    packModal(true, {
      isUpdate: false,
      packType:'default',
      showFooter: true
    });
  }
  
  
  /**
   * 删除默认套餐包
   */ 
  async function handleDelete(id) {
    await deleteTenantPack({ ids: id }, handleSuccess);
  }
  /**
   * 编辑
   */
  function handleEdit(record) {
    packModal(true, {     
      isUpdate: true,
      record: record,
      packType:'default',
      showFooter: true
    });
  }

  /**
   * 新增套餐包
   */
  async function handlePack() {
    if (unref(selectedRowKeys).length > 1) {
      createMessage.warn('请选择一个');
      return;
    }
    packModal(true, {
      tenantId: unref(selectedRowKeys.value.join(',')),
    });
  }

  /**
   * 删除成功之后回调事件
   */
  function handleSuccess() {
    (selectedRowKeys.value = []) && reload();
  }

  /**
   * 批量删除套餐包
   */
  async function handlePackBatch() {
    Modal.confirm({
      title: '删除租户套餐包',
      content: '是否删除租户套餐包',
      okText: '确认',
      cancelText: '取消',
      onOk: async () => {
        await deleteTenantPack({ ids: selectedRowKeys.value.join(',')}, handleSuccess);
      }
    })
  }
</script>
