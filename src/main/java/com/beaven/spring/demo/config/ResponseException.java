package com.beaven.spring.demo.config;

/**
 * @author tingw
 * @date 2018/06/15 14:41
 */
public class ResponseException extends RuntimeException {

    private static final long serialVersionUID = 4959167068635012591L;

    private int code;

    public ResponseException(int code) {
        this.code = code;
    }

    public ResponseException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
