package br.com.abruzzo.primeiros_passos_spring.controller.exception.handler;

public class ProblemasInformacoesEstadoException extends BusinessException{
    public ProblemasInformacoesEstadoException(String campoObrigatorioNaoInformado) {
        super("O campo %s é obrigatório e não foi informado", new Object[]{campoObrigatorioNaoInformado});
    }
}
