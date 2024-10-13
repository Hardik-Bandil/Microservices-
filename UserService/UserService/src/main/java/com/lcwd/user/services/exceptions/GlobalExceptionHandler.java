package com.lcwd.user.services.exceptions;

import com.lcwd.user.services.exceptions.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {

       String message = ex.getMessage();
      // ApiResponse build = ApiResponse.builder().message(message).success(true).success(true);
        return null;
    }
}
