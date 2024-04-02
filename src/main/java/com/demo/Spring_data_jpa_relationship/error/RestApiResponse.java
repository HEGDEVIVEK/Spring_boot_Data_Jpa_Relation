package com.demo.Spring_data_jpa_relationship.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus(HttpStatus.OK)
@ResponseBody
public class RestApiResponse extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InfoNotFound.class)
    public String ErrorResponse(InfoNotFound exception)
    {
        return exception.getMessage();
    }
}
