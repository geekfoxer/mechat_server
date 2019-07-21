package com.glozz.mechat.server.mapper;

import com.glozz.mechat.server.pojo.Friends;
import com.glozz.mechat.server.pojo.FriendsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface FriendsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    long countByExample(FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int deleteByExample(FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int insert(Friends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int insertSelective(Friends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    List<Friends> selectByExampleWithRowbounds(FriendsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    List<Friends> selectByExample(FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    Friends selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") Friends record, @Param("example") FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByExample(@Param("record") Friends record, @Param("example") FriendsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByPrimaryKeySelective(Friends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friends
     *
     * @mbg.generated Sat Jul 20 22:55:38 CST 2019
     */
    int updateByPrimaryKey(Friends record);
}