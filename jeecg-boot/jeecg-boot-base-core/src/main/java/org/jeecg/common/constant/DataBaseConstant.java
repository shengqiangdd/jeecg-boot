package org.jeecg.common.constant;
/**
 * 数据库上下文常量
 * @author: jeecg-boot
 */
public interface DataBaseConstant {

	/**
	 * 内置的系统变量键列表
	 */
	public static final String[] SYSTEM_KEYS = {
			DataBaseConstant.SYS_ORG_CODE, DataBaseConstant.SYS_ORG_CODE_TABLE, DataBaseConstant.SYS_MULTI_ORG_CODE,
			DataBaseConstant.SYS_MULTI_ORG_CODE_TABLE, DataBaseConstant.SYS_ORG_ID, DataBaseConstant.SYS_ORG_ID_TABLE,
			DataBaseConstant.SYS_ROLE_CODE, DataBaseConstant.SYS_ROLE_CODE_TABLE, DataBaseConstant.SYS_USER_CODE,
			DataBaseConstant.SYS_USER_CODE_TABLE, DataBaseConstant.SYS_USER_ID, DataBaseConstant.SYS_USER_ID_TABLE,
			DataBaseConstant.SYS_USER_NAME, DataBaseConstant.SYS_USER_NAME_TABLE, DataBaseConstant.SYS_DATE,
			DataBaseConstant.SYS_DATE_TABLE, DataBaseConstant.SYS_TIME, DataBaseConstant.SYS_TIME_TABLE,
			DataBaseConstant.SYS_BASE_PATH
	};
	
	//*********数据库类型****************************************

    /**MYSQL数据库*/
	public static final String DB_TYPE_MYSQL = "MYSQL";

    /** ORACLE*/
	public static final String DB_TYPE_ORACLE = "ORACLE";

    /**达梦数据库*/
	public static final String DB_TYPE_DM = "DM";

    /**postgreSQL达梦数据库*/
	public static final String DB_TYPE_POSTGRESQL = "POSTGRESQL";
	
    /**人大金仓数据库*/
	public static final String DB_TYPE_KINGBASEES = "KINGBASEES";

    /**sqlserver数据库*/
	public static final String DB_TYPE_SQLSERVER = "SQLSERVER";

    /**mariadb 数据库*/
	public static final String DB_TYPE_MARIADB = "MARIADB";

    /**DB2 数据库*/
	public static final String DB_TYPE_DB2 = "DB2";

    /**HSQL 数据库*/
	public static final String DB_TYPE_HSQL = "HSQL";

//	// 数据库类型，对应 database_type 字典
//	public static final String DB_TYPE_MYSQL_NUM = "1";
//	public static final String DB_TYPE_MYSQL7_NUM = "6";
//	public static final String DB_TYPE_ORACLE_NUM = "2";
//	public static final String DB_TYPE_SQLSERVER_NUM = "3";
//	public static final String DB_TYPE_POSTGRESQL_NUM = "4";
//	public static final String DB_TYPE_MARIADB_NUM = "5";

	//*********系统上下文变量****************************************
	/**
	 * 数据-所属机构编码
	 */
	public static final String SYS_ORG_CODE = "sysOrgCode";
	/**
	 * 数据-所属机构编码
	 */
	public static final String SYS_ORG_CODE_TABLE = "sys_org_code";
	/**
	 * 数据-所属机构编码
	 */
	public static final String SYS_MULTI_ORG_CODE = "sysMultiOrgCode";
	/**
	 * 数据-所属机构编码
	 */
	public static final String SYS_MULTI_ORG_CODE_TABLE = "sys_multi_org_code";
	/**
	 * 数据-所属机构ID
	 */
	public static final String SYS_ORG_ID = "sysOrgId";
	/**
	 * 数据-所属机构ID
	 */
	public static final String SYS_ORG_ID_TABLE = "sys_org_id";
	/**
	 * 数据-所属角色code（多个逗号分割）
	 */
	public static final String SYS_ROLE_CODE = "sysRoleCode";
	/**
	 * 数据-所属角色code（多个逗号分割）
	 */
	public static final String SYS_ROLE_CODE_TABLE = "sys_role_code";
	/**
	 * 数据-系统用户编码（对应登录用户账号）
	 */
	public static final String SYS_USER_CODE = "sysUserCode";
	/**
	 * 数据-系统用户编码（对应登录用户账号）
	 */
	public static final String SYS_USER_CODE_TABLE = "sys_user_code";
	/**
	 * 登录用户ID
	 */
	public static final String SYS_USER_ID = "sysUserId";
	/**
	 * 登录用户ID
	 */
	public static final String SYS_USER_ID_TABLE = "sys_user_id";
	/**
	 * 登录用户真实姓名
	 */
	public static final String SYS_USER_NAME = "sysUserName";
	/**
	 * 登录用户真实姓名
	 */
	public static final String SYS_USER_NAME_TABLE = "sys_user_name";
	/**
	 * 系统日期"yyyy-MM-dd"
	 */
	public static final String SYS_DATE = "sysDate";
	/**
	 * 系统日期"yyyy-MM-dd"
	 */
	public static final String SYS_DATE_TABLE = "sys_date";
	/**
	 * 系统时间"yyyy-MM-dd HH:mm"
	 */
	public static final String SYS_TIME = "sysTime";
	/**
	 * 系统时间"yyyy-MM-dd HH:mm"
	 */
	public static final String SYS_TIME_TABLE = "sys_time";
	/**
	 * 数据-所属机构编码
	 */
	public static final String SYS_BASE_PATH = "sys_base_path";
	//*********系统上下文变量****************************************
	
	
	//*********系统建表标准字段****************************************
	/**
	 * 创建者登录名称
	 */
	public static final String CREATE_BY_TABLE = "create_by";
	/**
	 * 创建者登录名称
	 */
	public static final String CREATE_BY = "createBy";
	/**
	 * 创建日期时间
	 */
	public static final String CREATE_TIME_TABLE = "create_time";
	/**
	 * 创建日期时间
	 */
	public static final String CREATE_TIME = "createTime";
	/**
	 * 更新用户登录名称
	 */
	public static final String UPDATE_BY_TABLE = "update_by";
	/**
	 * 更新用户登录名称
	 */
	public static final String UPDATE_BY = "updateBy";
	/**
	 * 更新日期时间
	 */
	public static final String UPDATE_TIME = "updateTime";
	/**
	 * 更新日期时间
	 */
	public static final String UPDATE_TIME_TABLE = "update_time";
	
	/**
	 * 业务流程状态
	 */
	public static final String BPM_STATUS = "bpmStatus";
	/**
	 * 业务流程状态
	 */
	public static final String BPM_STATUS_TABLE = "bpm_status";
	//*********系统建表标准字段****************************************

    /**
     * sql语句 where
     */
    String SQL_WHERE = "where";

    /**
     * sql语句 asc
     */
    String SQL_ASC = "asc";

    /**
     * sqlserver数据库,中间有空格
     */
    String DB_TYPE_SQL_SERVER_BLANK = "sql server";
}
