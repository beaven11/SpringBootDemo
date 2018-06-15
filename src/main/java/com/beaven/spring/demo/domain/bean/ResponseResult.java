package com.beaven.spring.demo.domain.bean;

/**
 * @author tingw
 * @date 2018/06/15 14:43
 */
public class ResponseResult<T> {

    private int code;

    private String message;

    private T data;

    private ResponseResult(int code, String message) {
        this(code, message, null);
    }

    private ResponseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static <T> ResponseResult<T> success(T t) {
        return new ResponseResult<>(200, "OK", t);
    }

    public static <T> ResponseResult<T> fail(int code, String msg) {
        return new ResponseResult<>(code, msg);
    }

}
