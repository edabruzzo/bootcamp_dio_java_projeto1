package br.com.abruzzo.primeiros_passos_spring.service;

import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import br.com.abruzzo.primeiros_passos_spring.dto.mappers.RegiaoMapper;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegiaoService {

    @Autowired
    RegiaoRepository regiaoRepository;

    public List<Estado> obterEstadosPorRegiao(String nomeRegiao){
        return regiaoRepository.findEstadosByNomeRegiao(nomeRegiao);
    }


    public List<RegiaoDto> listarRegioes() {
        return regiaoRepository.findAll().stream().map(RegiaoMapper::converterRegiaoModelParaDto).collect(Collectors.toList());
    }
}
