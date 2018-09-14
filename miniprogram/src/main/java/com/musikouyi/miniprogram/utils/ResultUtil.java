package com.musikouyi.miniprogram.utils;

import com.musikouyi.miniprogram.domain.entity.Result;
import com.musikouyi.miniprogram.domain.enums.ResultEnum;

public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result(ResultEnum.SUCCESS);
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result error(ResultEnum resultEnum){
        Result result = new Result(resultEnum);
        return result;
    }

}
