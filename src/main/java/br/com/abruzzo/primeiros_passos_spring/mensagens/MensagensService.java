package br.com.abruzzo.primeiros_passos_spring.mensagens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class MensagensService {

    @Autowired
    RemetentePadrao remetentePadrao;

    @Autowired
    RemetentePadrao remetentePadraoAlterado;
    public void enviarMensagem(String endereco) {
        remetentePadrao.enviarMensagem(endereco, "Enviando com remetente padrão");
        remetentePadraoAlterado.setEmail("emailAlterado@gmail.com");
        remetentePadraoAlterado.setNome("Outro usuário");
        remetentePadraoAlterado.setTelefones(new ArrayList<>(Arrays.asList(new Long[]{1188888888L, 1199999999L})));
        remetentePadraoAlterado.enviarMensagem(endereco, "Mudou o remetente padrão");
        remetentePadrao.enviarMensagem(endereco, "TESTANDO SE O REMETENTE TEM ESCOPO PROTOTYPE");
    }
}
