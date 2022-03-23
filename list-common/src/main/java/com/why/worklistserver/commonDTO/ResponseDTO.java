package com.why.worklistserver.commonDTO;

import com.why.worklistserver.commonenum.ResponseErrorEnum;
import lombok.Data;

/**
 * @ClassName：ResponseDTO
 * @Description：todo同一封装返回数据
 * @Author: why
 * @DateTime：2022/3/22 14:55
 */
@Data
public class ResponseDTO {
    private Integer code;
    private String msg;
    private Object data;

    public static ResponseDTO Success(){
        return new ResponseDTO(200,"SUCCESS");
    }

    public static ResponseDTO Success(Object data){
        return new ResponseDTO(200,"SUCCESS",data);
    }

    public static ResponseDTO error(ResponseErrorEnum errorEnum){
        return new ResponseDTO(errorEnum.getCode(),errorEnum.getMsg());
    }

    public ResponseDTO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseDTO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
