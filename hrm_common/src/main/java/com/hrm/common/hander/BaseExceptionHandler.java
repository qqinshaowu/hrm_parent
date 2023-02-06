package com.hrm.common.hander;


import com.hrm.common.entity.Result;
import com.hrm.common.entity.ResultCode;
import com.hrm.common.exception.CommonException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 全局异常处理
* 自定义的公共异常处理器
*       1.声明异常处理器
*       2.对异常统一处理
*
* */
@ControllerAdvice
public class BaseExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)//拦截的是父类,拦截的是所有的异常
    public Result error(HttpServletRequest request, HttpServletResponse response,Exception e){

        //如果拦截到的异常是自定义异常
        if (e.getClass() == CommonException.class){
            //强转为自定义异常类，然后调用里面的方法
            CommonException commonException = (CommonException) e;

            ResultCode resultCode = commonException.getResultCode();

            //将resultCOde中有的信息交给Result进行返回
            return new Result(resultCode);


        }else{
            //如果不是自定义异常类给全局处理器处理
            e.printStackTrace();
            return new Result(ResultCode.SERVER_ERROR);

        }

    }
}
