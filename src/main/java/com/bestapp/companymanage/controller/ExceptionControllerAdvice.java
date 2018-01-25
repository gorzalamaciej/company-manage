package com.bestapp.companymanage.controller;

import com.bestapp.companymanage.exception.MappedException;
import com.bestapp.companymanage.type.response.GenericResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MappedException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public GenericResponse exceptionHandler(MappedException ex) {
        return new GenericResponse(ex.getErrorCode(), ex.getMessage());
    }
}
