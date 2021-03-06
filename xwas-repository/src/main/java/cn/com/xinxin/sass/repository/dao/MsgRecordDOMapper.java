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

import cn.com.xinxin.sass.repository.model.MsgRecordDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MsgRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_record
     *
     * @mbg.generated
     */
    int insert(MsgRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_record
     *
     * @mbg.generated
     */
    int insertSelective(MsgRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_record
     *
     * @mbg.generated
     */
    MsgRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MsgRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table msg_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MsgRecordDO record);

    /**
     * 批量插入记录
     * @param msgRecordDOS 消息记录
     * @return 插入记录条数
     */
    int insertBatch(@Param(value = "msgRecordDOS") List<MsgRecordDO> msgRecordDOS);

    /**
     * 通过机构id，userid，消息发送时间范围查询记录
     * @param userId 用户id
     * @param startTime 消息发送时间范围之起始时间
     * @param endTime 消息发送时间范围之终止时间
     * @param index 消息记录起始
     * @param pageSize 页大小
     * @param tenantId 机构id
     * @param keyWord 关键字
     * @return 消息记录
     */
    List<MsgRecordDO> selectPageByOrgIdAndUserIdAndTime(@Param(value = "userId") String userId,
                                                    @Param(value = "startTime") String startTime,
                                                    @Param(value = "endTime") String endTime,
                                                    @Param(value = "index") Long index,
                                                    @Param(value = "pageSize") Integer pageSize,
                                                    @Param(value = "tenantId") String tenantId,
                                                    @Param(value = "keyWord") String keyWord);

    /**
     * 通过机构id，userid，消息发送时间范围查询记录总数
     * @param userId 用户id
     * @param startTime 消息发送时间范围之起始时间
     * @param endTime 消息发送时间范围之终止时间
     * @param tenantId 机构id
     * @param keyWord 关键字
     * @return 消息记录总数
     */
    Long selectCountByOrgIdAndUserIdAndTime(@Param(value = "userId") String userId,
                                                    @Param(value = "startTime") String startTime,
                                                    @Param(value = "endTime") String endTime,
                                                    @Param(value = "tenantId") String tenantId,
                                                    @Param(value = "keyWord") String keyWord);

    /**
     * 查询两个用户之间的会话记录
     * @param tenantId
     * @param userIdOne
     * @param userIdTwo
     * @return
     */
    List<MsgRecordDO> selectMsgRecordBetweenPersons(@Param("tenantId") String tenantId, @Param("userIdOne") String userIdOne, @Param("userIdTwo") String userIdTwo,
                                                    @Param("startTime") String startTime, @Param("endTime") String endTime, @Param("keyWord") String keyWord);

    /**
     * 查询群聊会话记录
     * @param tenantId
     * @param roomId
     * @return
     */
    List<MsgRecordDO> selectRoomMsgRecord(@Param("tenantId") String tenantId,@Param("roomId") String roomId,
                                          @Param("startTime") String startTime, @Param("endTime") String endTime, @Param("keyWord") String keyWord);

    Integer selectRowNumberById(@Param("id") Long id,@Param("tenantId") String tenantId, @Param("roomId") String roomId,
                             @Param("userIdOne") String userIdOne, @Param("userIdTwo") String userIdTwo);

    /**
     * 通过租户id和成员userid查询会话记录
     * @param tenantId 租户id
     * @param userId 成员userid
     * @param keyWord 关键字
     * @param startTime 消息发送时间范围之起始时间
     * @param endTime 消息发送时间范围之终止时间
     * @return 会话记录
     */
    List<MsgRecordDO> selectByMemberUserIdAndKeyWordAndTime(@Param("tenantId") String tenantId,
                                             @Param(value = "userId") String userId,
                                           @Param(value = "keyWord") String keyWord,
                                           @Param(value = "startTime") String startTime,
                                           @Param(value = "endTime") String endTime);
}