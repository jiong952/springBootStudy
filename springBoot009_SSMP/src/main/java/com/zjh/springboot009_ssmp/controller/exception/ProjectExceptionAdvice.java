package com.zjh.springboot009_ssmp.controller.exception;

import com.zjh.springboot009_ssmp.controller.utils.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 张俊鸿
 * @description:
 * @since 2022-07-18 0:42
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public R doException(Exception ex){
        //记录日志
        //通知运维
        ex.printStackTrace();
        return new R("服务器故障！！");
    }
}
