# This is common webapp example project templates



## 权限值编码规则:
   
   1.基本名称:SASS+功能名称(如资源权限操作:RESOURCE)+分类(如菜单:MENU)+操作(CREATE/REMOVE/UPDATE)
   具体实例比如说对于菜单菜单管理功能:
  
   2.查询以及列表功能: SASS_RESOURCE_MENU_QUERY_LIST
   
   3.权限值码表:
   
   | 中文名称  | 编码值 |  备注说明 |
   | :---- | :---- | :---- |
   | 菜单查询以及列表功能  | SASS_RESOURCE_MENU_QUERY_LIST  |   |
   | 资源权限添加 | SASS_RESOURCE_MENU_FUNCTION_ADD  |   |
   | 资源权限删除  | SASS_RESOURCE_MENU_FUNCTION_REMOVE  |   |
   | 资源权限修改  | SASS_RESOURCE_MENU_FUNCTION_UPDATE  |   |
   | 资源权限管理  | SASS_RESOURCE_MENU_FUNCTION_MNG  |   |
   | 组织机构查询以及列表功能  | SASS_ORG_QUERY_LIST  |   |
   | 组织机构新增  | SASS_ORG_ADD  |   |
   | 组织机构修改  | SASS_ORG_UPDATE  |   |
   | 组织机构删除  | SASS_ORG_DELETE  |   |
   | 组织机构管理  | SASS_ORG_MNG  |   |
   | 角色查询列表权限  | SASS_ROLE_QUERY_LIST  |   |
   | 角色新增权限  | SASS_ROLE_ADD  |   |
   | 角色修改权限  | SASS_ROLE_UPDATE  |   |
   | 角色删除权限  | SASS_ROLE_DELETE  |   |
   | 角色授权资源权限  | SASS_ROLE_GRANT_RESOURCE  |   |
   | 角色授权用户权限  | SASS_ROLE_GRANT_USER  |   |
   | 角色管理权限  | SASS_ROLE_MNG  |   |
   | 标签查询列表权限  | SASS_TAG_QUERY_LIST  |   |
   | 标签新增权限  | SASS_TAG_ADD  |   |
   | 标签修改权限  | SASS_TAG_UPDATE  |   |
   | 标签删除权限  | SASS_TAG_DELETE  |   |
   | 给数据上标签  | SASS_TAG_FIX_DATA  |   |
   | 标签管理功能  | SASS_TAG_MNG | 
   | 租户查询列表权限  | SASS_TENANT_QUERY_LIST  |   |
   | 租户新增权限  | SASS_TENANT_ADD  |   |
   | 租户修改权限  | SASS_TENANT_UPDATE  |   |
   | 租户删除权限  | SASS_TENANT_DELETE  |   |
   | 租户管理权限  | SASS_TENANT_MNG  |   |
   | 租户定时任务配置管理  | SASS_TENANT_TASK_CONFIG_MNG  |   |
   | 用户查询列表  | SASS_USER_QUERY_LIST  |   |
   | 用户新增权限  | SASS_USER_ADD  |   |
   | 用户修改权限  | SASS_USER_UPDATE  |   |
   | 用户删除权限  | SASS_USER_DELETE  |   |
   | 用户角色授权  | SASS_USER_ROLE_GRANT  |   |
   | 重置用户密码  | SASS_USER_PASSWORD_REST  |   |
   | 用户管理功能  | SASS_USER_MNG  |   |
   | 用户操作日志记录管理  | SASS_USER_OPLOG_MNG  |   |
   | 用户操作日志记录查询  | SASS_USER_OPLOG_QUERY  |   |
   | 企业微信部门管理权限  | SASS_WEXIN_DEPT_MNG  |   |
   | 企业微信员工管理权限  | SASS_WEXIN_STAFF_MNG  |   |
   | 企业微信客户管理权限  | SASS_WEXIN_CUSTOMER_MNG  |   |
   | 企业微信消息管理权限  | SASS_WEXIN_MSG_MNG  |   |