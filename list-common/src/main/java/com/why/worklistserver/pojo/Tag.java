package com.why.worklistserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName：Tag
 * @Description：todo分类标签实体类
 * @Author: why
 * @DateTime：2022/3/21 14:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag {
    /** 分类标签id **/
    private Integer id;
    /** 分类标签 **/
    private String tag;
    /** 创建时间 **/
    private Date createTime;
    /** 更新时间 **/
    private Date updateTIme;

    public Tag(Integer id, String tag) {
        this.id = id;
        this.tag = tag;
    }
}
