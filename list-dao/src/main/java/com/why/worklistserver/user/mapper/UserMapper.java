package com.why.worklistserver.user.mapper;

import com.why.worklistserver.pojo.Account;
import org.apache.ibatis.annotations.*;

/**
 * @InterfaceName：UserMapper
 * @Description 用户mapper
 * @Author: why
 * @Date：2022/3/21
 **/
public interface UserMapper {
    String table = "account";
    String field = "account, passwd";
    String allField = "id, account, passwd, create_time, update_time";

    @Insert("INSERT INTO "+ table + "(" + field + ") VALUES(#{account},#{passwd});")
    void save(Account account);

    @Delete("DELETE FROM " + table + " WHERE account = #{account}")
    void deleteByAccount(@Param("account") String account);

    @Update("UPDATE " + table + " SET account = #{account},passwd = #{passwd} WHERE id = #{id}")
    void update(Account account);

    @Select("SELECT " + allField + " FROM " + table + " WHERE id = #{id}")
    Account getByAccountId(@Param("id") Integer id);

    @Select("SELECT " + allField + " FROM " + table + " WHERE account = #{account}")
    Account getByAccount(@Param("account") String account);
}
