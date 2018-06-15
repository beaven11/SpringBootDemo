package com.beaven.spring.demo.config;

import com.beaven.spring.demo.domain.bean.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tingw
 * @date 2018/06/15 14:51
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ResponseException.class)
    public ResponseResult customExceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        response.setStatus(HttpStatus.BAD_GATEWAY.value());
        ResponseException responseException = (ResponseException) e;
        return ResponseResult.fail(responseException.getCode(), responseException.getMessage());
    }

}
