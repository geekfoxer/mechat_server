package com.glozz.mechat.server.mapper;

import com.glozz.mechat.server.pojo.FriendsRequest;
import com.glozz.mechat.server.pojo.FriendsRequestExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface FriendsRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    long countByExample(FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int deleteByExample(FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int insert(FriendsRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int insertSelective(FriendsRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    List<FriendsRequest> selectByExampleWithRowbounds(FriendsRequestExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    List<FriendsRequest> selectByExample(FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    FriendsRequest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByExample(@Param("record") FriendsRequest record, @Param("example") FriendsRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByPrimaryKeySelective(FriendsRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends_request
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByPrimaryKey(FriendsRequest record);
}