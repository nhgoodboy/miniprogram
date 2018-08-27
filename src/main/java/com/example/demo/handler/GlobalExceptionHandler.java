package com.example.demo.handler;

import com.example.demo.domain.entity.Result;
import com.example.demo.domain.enums.ResultEnum;
import com.example.demo.exception.GlobalException;
import com.example.demo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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

//    public Object errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
//        e.printStackTrace();
//
//        if(isAjax(request)) {
//            return response;
//        }else {
//            ModelAndView mav = new ModelAndView();
//            mav.addObject("exception",  e);
//            mav.addObject("url", request.getRequestURL());
//            mav.setViewName("error");
//            return mav;
//        }
//    }

}
