package com.musikouyi.miniprogram.handler;

import com.musikouyi.miniprogram.domain.entity.Result;
import com.musikouyi.miniprogram.domain.enums.ResultEnum;
import com.musikouyi.miniprogram.exception.GlobalException;
import com.musikouyi.miniprogram.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@SuppressWarnings("ALL")  //可去掉
@ControllerAdvice //用于拦截全局的Controller的异常，注意：ControllerAdvice注解只拦截Controller不会拦截Interceptor的异常
public class GlobalExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GlobalException) {
            GlobalException globalException = (GlobalException) e;
            return ResultUtil.error(globalException.getCode(), globalException.getMessage());
        } else {
            logger.error(ResultEnum.UNKNOWN_ERROR.getMsg(), e);
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR);
        }
    }
}
