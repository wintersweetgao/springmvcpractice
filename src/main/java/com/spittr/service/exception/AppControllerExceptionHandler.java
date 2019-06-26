package com.spittr.service.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * controller异常通知处理类，将所有controller的异常收集到一个地方处理
 * @author dongmei.gao
 * @date 2019/5/31 13:34
 */
@ControllerAdvice
public class AppControllerExceptionHandler {
    /**
     * 当发生NotFoundException异常时，定位到一个错误页面
     * @return
     */
    @ExceptionHandler(NotFoundException.class)
    public String notFoundException(){
        return "error/notfound" ;
    }
}

