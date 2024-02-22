package br.com.abruzzo.primeiros_passos_spring.controller.exception.handler;


import jakarta.annotation.Resource;
import org.springframework.context.MessageSource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Resource
    private MessageSource messageSource;

    private HttpHeaders headers(){
        HttpHeaders headers =  new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    private ResponseError responseError(String mensagem, HttpStatus statusCode){
        ResponseError responseError = new ResponseError();
        responseError.setStatus("error");
        responseError.setStatusCode(statusCode.value());
        responseError.setTimestamp(new Date());
        responseError.setError(mensagem);
        return responseError;
    }


    //@ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleGeneral(Exception ex, WebRequest request) {
        if(ex.getClass().isAssignableFrom(UndeclaredThrowableException.class)){
            UndeclaredThrowableException exception = (UndeclaredThrowableException) ex;
            return handleBusinessException((BusinessException)exception.getUndeclaredThrowable(), request);
        }else{
            String bodyOfResponse = this.messageSource.getMessage("error.server", new String[]{ex.getMessage()}, null);
            ResponseError responseError = responseError(bodyOfResponse, HttpStatus.INTERNAL_SERVER_ERROR);
            return handleExceptionInternal(ex, responseError,headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        }
    }

    @ExceptionHandler(value = { BusinessException.class })
    protected ResponseEntity<Object> handleBusinessException(RuntimeException ex, WebRequest request) {
        ResponseError responseError = responseError(ex.getMessage(),HttpStatus.CONFLICT);
        return handleExceptionInternal(ex, responseError, headers(), HttpStatus.CONFLICT, request);
    }
}
