package br.com.abruzzo.primeiros_passos_spring.service;

import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegiaoService {

    @Autowired
    RegiaoRepository regiaoRepository;

    public List<Estado> obterEstadosPorRegiao(String nomeRegiao){
        return regiaoRepository.findEstadosByNomeRegiao(nomeRegiao);
    }


}
