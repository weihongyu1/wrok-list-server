package com.why.worklistserver.commonenum;

/**
 * @ClassName：ResponseDTO
 * @Description：todo封装错误状态
 * @Author: why
 * @DateTime：2022/3/22 14:55
 */
public enum ResponseErrorEnum {
    ERROR_LOGIN(1000,"登录失败");

    private Integer code;
    private String msg;

    ResponseErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
