package com.wudner.springcloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult<T> {

    private Integer code;
    private String message;
    private T data;

    public ApiResult(Integer code, String message){
        this(code, message, null);
    }
}
