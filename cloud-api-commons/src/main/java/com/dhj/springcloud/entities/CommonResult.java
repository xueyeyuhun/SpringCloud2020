package com.dhj.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Hongjie Ding
 * @Description:
 * @Date:Created in 2020/4/1 19:17
 * @Modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
