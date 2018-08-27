package com.example.demo.exception;

import com.example.demo.domain.enums.ResultEnum;

public class GlobalException extends RuntimeException {

    private Integer code;

    public GlobalException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }
}
