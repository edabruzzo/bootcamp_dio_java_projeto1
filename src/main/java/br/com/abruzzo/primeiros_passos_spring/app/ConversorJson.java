package br.com.abruzzo.primeiros_passos_spring.app;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {

    @Autowired
    Gson gson;
    public String converter(String json){
        return this.gson.fromJson(json, ViaCepResponse.class).toString();
    }

}
