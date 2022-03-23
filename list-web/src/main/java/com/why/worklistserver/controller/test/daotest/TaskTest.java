package com.why.worklistserver.controller.test.daotest;

import com.why.worklistserver.commonDTO.ResponseDTO;
import com.why.worklistserver.pojo.Task;
import com.why.worklistserver.task.mapper.TaskMapper;
import com.why.worklistserver.task.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName：TaskTest
 * @Description：todotask dao层方法测试
 * @Author: why
 * @DateTime：2022/3/22 14:53
 */
@RestController
@Slf4j
@RequestMapping("/test")
public class TaskTest {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    TaskMapper taskMapper;

    @RequestMapping("/task")
    public ResponseDTO test(){
        log.info("save");
        taskRepository.save(new Task("编写待办事项代码","为曹佳编写",new Date(),0,1,1));
        log.info("update");
        taskRepository.update(new Task("关于喜欢曹佳这件事","为曹佳编写",new Date(),0,1,1));
        log.info("get");
        Task byTaskId = taskRepository.getByTaskId(1);
        log.info(byTaskId.toString());
        log.info("delete");
        taskRepository.deleteByTaskId(1);
        return ResponseDTO.Success();
    }
}
