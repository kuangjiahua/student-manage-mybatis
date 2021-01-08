package com.demo.studentmanage.dto.common;

import com.demo.studentmanage.constant.ResponseConstant;
import lombok.Data;

/**
 * 接口统一返回对象
 * @author kuangjiahua
 * @date   2021/01/04
 */
@Data
public class ApiResponseDTO {

    private String msg;
    private Object result;

    public ApiResponseDTO() {
        this(ResponseConstant.DEFAULT, null);
    }

    public ApiResponseDTO(Object result) {
        this();
        this.result = result;
    }

    public ApiResponseDTO(String msg) {
        this(msg, null);
    }

    public ApiResponseDTO(String message, Object result) {
        if (!message.isEmpty()) {
            this.msg = message;
        }
        this.result = result;
    }


    public ApiResponseDTO setData(Object result) {
        this.result = result;
        return this;
    }

}

