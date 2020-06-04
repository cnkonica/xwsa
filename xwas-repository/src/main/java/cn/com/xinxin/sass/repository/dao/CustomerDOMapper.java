package cn.com.xinxin.sass.repository.dao;

/*
 *
 * Copyright 2020 www.xinxindigits.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"),to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice
 * shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Redistribution and selling copies of the software are prohibited, only if the authorization from xinxin digits
 * was obtained.Neither the name of the xinxin digits; nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written permission.
 *
 */

import cn.com.xinxin.sass.repository.model.CustomerDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int insert(CustomerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int insertSelective(CustomerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    CustomerDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CustomerDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CustomerDO record);

    /**
     * 通过机构id和客户userId查询客户信息
     * @param tenantId 机构id
     * @param userIdS 客户userid
     * @return 客户信息
     */
    List<CustomerDO> selectByOrgIdAndUserId(@Param(value = "tenantId") String tenantId,
                                            @Param(value = "userIdS") List<String> userIdS);

    /**
     * 批量插入记录
     * @param customerDOS 客户信息
     * @return 成功插入数量
     */
    int insertBatch(@Param(value = "customerDOS") List<CustomerDO> customerDOS);

    /**
     * 批量更新数据
     * @param customerDOS 客户信息
     * @return 成功更新条数
     */
    int updateBatch(@Param(value = "customerDOS") List<CustomerDO> customerDOS);

    /**
     * 根据成员UserId列表，以及添加客户的时间范围查询成员添加的客户
     * @param memberUserIdS 成员UserId列表
     * @param startTime 起始时间
     * @param endTime 终止时间
     * @param index 页码
     * @param pageSize 页大小
     * @param tenantId 机构id
     * @param customerName 客户名称
     * @return 分页查询的客户信息
     */
    List<CustomerDO> selectPageByOrgIdAndMemberUserIdSAndTimeAndCustName(
                                    @Param(value = "memberUserIdS") List<String> memberUserIdS,
                                   @Param(value = "startTime") String startTime,
                                   @Param(value = "endTime") String endTime,
                                   @Param(value = "index") Long index,
                                   @Param(value = "pageSize") Integer pageSize,
                                   @Param(value = "tenantId") String tenantId,
                                   @Param(value = "customerName") String customerName);

    /**
     * 根据成员UserId列表，以及添加客户的时间范围查询成员添加的客户数量
     * @param memberUserIdS 成员UserId列表
     * @param startTime 起始时间
     * @param endTime 终止时间
     * @param tenantId 机构id
     * @param customerName 客户名称
     * @return 分页查询的客户信息
     */
    Long selectCountByOrgIdAndMemberUserIdSAndTimeAndCustName(@Param(value = "memberUserIdS") List<String> memberUserIdS,
                                                  @Param(value = "startTime") String startTime,
                                                  @Param(value = "endTime") String endTime,
                                                  @Param(value = "tenantId") String tenantId,
                                                  @Param(value = "customerName") String customerName);


    /**
     *
     * @return
     */
    List<CustomerDO> queryAllCustomerByPages();


    /**
     * 将记录状态置为失效
     * @param tenantId 租户id
     * @param taskId 任务流水
     * @return 成功更新的条数
     */
    int updateInactiveStatus(@Param(value = "tenantId") String tenantId, @Param(value = "taskId") String taskId);

    /**
     * 查询客户用户名
     * @param tenantId 租户id
     * @param userIdS 客户userids
     * @return 客户用户名及userid
     */
    List<CustomerDO> queryCustomerNameByTenantIdAndUserIdS(@Param(value = "tenantId") String tenantId,
                                                           @Param(value = "userIdS") List<String> userIdS);
}