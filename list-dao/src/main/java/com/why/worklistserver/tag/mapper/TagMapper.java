package com.why.worklistserver.tag.mapper;

import com.why.worklistserver.pojo.Tag;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @InterfaceName：TagMapper
 * @Description：分类标签mapper
 * @Author: why
 * @Date：2022/3/21
 **/
public interface TagMapper {
    String table = "tag";
    String field = "tag";
    String allField = "id, tag, create_time, update_time";

    @Insert("INSERT INTO "+ table + "(" + field + ") VALUES(#{tag});")
    void save(Tag tag);

    @Delete("DELETE FROM " + table + " WHERE id = #{id}")
    void deleteByTagId(@Param("id") Integer id);

    @Delete("DELETE FROM " + table + " WHERE tag = #{tag}")
    void deleteByTag(@Param("tag") String tag);

    @Update("UPDATE " + table + " SET tag = #{tag} WHERE id = #{id}")
    void update(Tag tag);

    @Select("SELECT " + allField + " FROM " + table + " WHERE id = #{id}")
    Tag getByTagId(@Param("id") Integer id);

    @Select("SELECT " + allField + " FROM " + table + " WHERE tag = #{tag}")
    Tag getByTag(@Param("tag") String tag);

    @Select("SELECT " + allField + " FROM " + table)
    List<Tag> getAllTag();
}
