package com.hrm.common.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 数据响应对象
*
* */
@Data//get and set 方法省略不用些
@NoArgsConstructor //构造器省略不用写
public class Result {
    private boolean success ;//是否成功
    private Integer code;// 返回码
    private String message;//返回信息
    private Object data;// 返回数据

    public Result(ResultCode code) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
    }

    public Result(ResultCode code,Object data) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
    }

    public Result(Integer code,String message,boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }


    public static Result ERROR(){
        return new Result(ResultCode.SERVER_ERROR);
    }


    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }

}
