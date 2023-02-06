package com.hrm.common.exception;

/*
* 自定义的异常
* */

import com.hrm.common.entity.ResultCode;
import lombok.Getter;

@Getter
public class CommonException extends Exception{

    private ResultCode resultCode;

    public CommonException(ResultCode resultCode){
        this.resultCode = resultCode;
    }

}
