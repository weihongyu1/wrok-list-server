package com.why.worklistserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName：Account
 * @Description：todo用户账户表实体类
 * @Author: why
 * @DateTime：2022/3/21 14:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    /** 账号id **/
    private Integer id;
    /** 用户账号 **/
    private String account;
    /** 用户密码 **/
    private String passwd;
    /** 创建时间 **/
    private Date createTime;
    /** 更新时间 **/
    private Date updateTIme;

    public Account(String account, String passwd) {
        this.account = account;
        this.passwd = passwd;
    }

    public Account(Integer id, String account, String passwd) {
        this.id = id;
        this.account = account;
        this.passwd = passwd;
    }
}
