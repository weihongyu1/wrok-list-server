package com.why.worklistserver.task.mapper;

import com.why.worklistserver.pojo.Tag;
import com.why.worklistserver.pojo.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @InterfaceName：TaskMapper
 * @Description：任务mapper
 * @Author: why
 * @Date：2022/3/22
 **/
public interface TaskMapper {
    String table = "task";
    String field = "task, edit, task_time, flag, tag_id, account_id";
    String allField = "id, task, edit, task_time, flag, tag_id, account_id, create_time, update_time";

    @Insert("INSERT INTO "+ table + "(" + field + ") VALUES(#{task},#{edit},#{taskTime},#{flag},#{tagId},#{accountId});")
    void save(Task task);

    @Delete("DELETE FROM " + table + " WHERE id = #{id}")
    void deleteByTaskId(@Param("id") Integer id);

    @Update("UPDATE " + table + " SET task = #{task}, edit = #{edit}, task_time = #{taskTime}, flag = #{flag}, tag_id = #{tagId} WHERE id = #{id}")
    void update(Task task);

    @Select("SELECT " + allField + " FROM " + table + " WHERE id = #{id}")
    Task getByTaskId(@Param("id") Integer id);

    @Select("SELECT " + allField + " FROM " + table + " WHERE account_id = #{accountId}")
    List<Task> getAccountAllTask(Integer accountId);
}
