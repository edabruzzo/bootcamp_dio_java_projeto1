package br.com.abruzzo.primeiros_passos_spring.controller.exception.handler;

public class RegiaoInvalidaException extends BusinessException{
    public RegiaoInvalidaException(String message, Object... params) {
        super(message, params);
    }
}
