package com.hrm.common.entity;

/*
* 公共返回码
* */
public enum ResultCode {
    SUCCESS(true,10000,"操作成功！"),

    //系统错误返回码
    FAIL(false,10001,"操作失败"),
    UNAUTHENTICATEN(false,10002,"您还未登录"),
    UNAUTHORISE(false,10003,"权限不足"),
    SERVER_ERROR(false,9999,"抱歉，系统繁忙，请稍后再试");

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;


    //枚举类的构造器
    ResultCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    //GET 方法
    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


    //
//    //---用户操作返回码----
//    //---企业操作返回码----
//    //---权限操作返回码----
//    //---其他操作返回码----
//
//    //操作是否成功
//    boolean success;
//    //操作代码
//    int code;
//    //提示信息
//    String message;
//
//    ResultCode(boolean success,int code, String message){
//        this.success = success;
//        this.code = code;
//        this.message = message;
//    }
//
//    public boolean success() {
//        return success;
//    }
//
//    public int code() {
//        return code;
//    }
//
//    public String message() {
//        return message;
//    }




}
