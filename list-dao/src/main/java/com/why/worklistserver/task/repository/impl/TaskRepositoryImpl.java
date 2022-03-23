package com.why.worklistserver.task.repository.impl;

import com.why.worklistserver.pojo.Task;
import com.why.worklistserver.task.mapper.TaskMapper;
import com.why.worklistserver.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName：TaskRepositoryImpl
 * @Description：todo任务数据接口实现类
 * @Author: why
 * @DateTime：2022/3/22 14:48
 */
@Repository
public class TaskRepositoryImpl implements TaskRepository {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public void save(Task task) {
        taskMapper.save(task);
    }

    @Override
    public void deleteByTaskId(Integer id) {
        taskMapper.deleteByTaskId(id);
    }

    @Override
    public void update(Task task) {
        taskMapper.update(task);
    }

    @Override
    public Task getByTaskId(Integer id) {
        return taskMapper.getByTaskId(id);
    }

    @Override
    public List<Task> getAccountAllTask(Integer accountId) {
        return taskMapper.getAccountAllTask(accountId);
    }
}
