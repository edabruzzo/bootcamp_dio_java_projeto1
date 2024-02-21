package br.com.abruzzo.primeiros_passos_spring.app;

import br.com.abruzzo.primeiros_passos_spring.mensagens.RemetentePadrao;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansFactory {


    /*
    @Value("${nome.remetente:Usuário Padrão}")
    private String nomeRemetente;

    @Value("${email.remetente}")
    private String emailRemetente;
    //private List<Long> telefonesRemetente = new ArrayList<>(Arrays.asList(new Long[]{}));
    @Value("${telefones.remetente}")
    private List<Long> telefonesRemetente;

     */

    @Bean
    public Gson gson(){
        return new Gson();
    }

    /*
    @Bean
    @Scope("prototype")
    public RemetentePadrao remetentePadrao(){
        RemetentePadrao remetentePadrao = new RemetentePadrao();
        return remetentePadrao;
    }
    */
}
