package com.why.worklistserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName：Task
 * @Description：todo任务实体类
 * @Author: why
 * @DateTime：2022/3/21 14:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    /** 任务id **/
    private Integer id;
    /** 任务 **/
    private String task;
    /** 描述 **/
    private String edit;
    /** 执行时间 **/
    private Date taskTime;
    /** 是否完成标志，完成：0，未完成：1 **/
    private Integer flag;
    /** 标签id **/
    private Integer tagId;
    /** 用户id **/
    private Integer accountId;
    /** 创建时间 **/
    private Date createTime;
    /** 更新时间 **/
    private Date updateTIme;

    public Task(String task, String edit, Date taskTime, Integer flag, Integer tagId, Integer accountId) {
        this.task = task;
        this.edit = edit;
        this.taskTime = taskTime;
        this.flag = flag;
        this.tagId = tagId;
        this.accountId = accountId;
    }
}
