package br.com.abruzzo.primeiros_passos_spring.app;

public class ViaCepResponse {
    String cep;
    String logradouro;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "ViaCepResponse{" +
                "cep='" + this.cep + '\'' +
                ", logradouro='" + this.logradouro + '\'' +
                '}';
    }
}
