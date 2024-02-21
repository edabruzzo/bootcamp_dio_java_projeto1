package br.com.abruzzo.primeiros_passos_spring.mensagens;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "remetente") // https://www.baeldung.com/spring-boot-properties-env-variables
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // https://www.baeldung.com/spring-inject-prototype-bean-into-singleton
public class RemetentePadrao {

    private String nome;
    private String email;
    private List<Long> telefones;

    public void enviarMensagem(String endereco, String mensagem) {
        System.out.println("Mensagem enviada = " + mensagem);
        System.out.println("Mensagem Enviada ao seguinte endereço " + endereco);
        System.out.println(this.toString());
    }
}
