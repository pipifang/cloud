package com.zcg.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : zcg
 * @Data ：Create in 11:032021/4/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;

    private String message;

    private T date;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
