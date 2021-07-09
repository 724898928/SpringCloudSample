package com.lee.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Package: com.lee.api.pojo
 * Description： TODO
 * Author: CareLee
 * Date: Created in 7/8/2021 6:25 PM
 * Copyright: Copyright (c) 2040. All rights reserved.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;   // 类似404
    private String message; // 信息描述
    private T data;         // 消息体

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
