package br.com.abruzzo.primeiros_passos_spring.controller.exception.handler;



/*

https://www.baeldung.com/exception-handling-for-rest-with-spring
https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html#mvc-ann-rest-spring-mvc-exceptions
 */
public class BusinessException extends RuntimeException{
    public BusinessException(String message, Object ... params) {
        super(String.format(message, params));
    }
}
