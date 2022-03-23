package com.why.worklistserver.task.repository;

import com.why.worklistserver.pojo.Task;
import java.util.List;

/**
 * @InterfaceName：TaskRepository
 * @Description：任务数据接口
 * @Author: why
 * @Date：2022/3/22
 **/
public interface TaskRepository {
    /**
     * 保存数据
     * @param task
     */
    void save(Task task);

    /**
     * 根据任务id删除数据
     * @param id
     */
    void deleteByTaskId(Integer id);

    /**
     * 更新任务
     * @param task
     */
    void update(Task task);

    /**
     * 根据任务id获取任务信息
     * @param id
     * @return
     */
    Task getByTaskId(Integer id);

    /**
     * 根据用户id获取用户所用任务数据
     * @param accountId
     * @return
     */
    List<Task> getAccountAllTask(Integer accountId);
}
