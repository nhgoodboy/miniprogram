package com.example.demo.handle;

import com.example.demo.domain.entity.Result;
import com.example.demo.exception.GirlException;
import com.example.demo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(), girlException.getMessage());
        } else {
            logger.error("【系统异常】", e);
            return ResultUtil.error(-1, "未知错误");
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
