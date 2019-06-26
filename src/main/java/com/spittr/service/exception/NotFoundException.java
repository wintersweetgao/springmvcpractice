package com.spittr.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author dongmei.gao
 * @date 2019/5/31 13:41
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND,
                 reason = "对象没有找到错误")
public class NotFoundException extends  RuntimeException{
/*    private String errorCode ;
    private String errorMsg ;*/


}
