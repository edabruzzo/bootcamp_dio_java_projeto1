package br.com.abruzzo.primeiros_passos_spring.service;

import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import br.com.abruzzo.primeiros_passos_spring.dto.mappers.EstadoMapper;
import br.com.abruzzo.primeiros_passos_spring.dto.mappers.RegiaoMapper;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.model.Regiao;
import br.com.abruzzo.primeiros_passos_spring.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegiaoService {

    @Autowired
    RegiaoRepository regiaoRepository;

    @Autowired
    RegiaoMapper regiaoMapper;

    @Autowired
    EstadoMapper estadoMapper;


    public List<EstadoDto> obterEstadosPorRegiao(String nomeRegiao){
        return regiaoRepository.findEstadosByNomeRegiao(nomeRegiao).stream().map(estado -> this.estadoMapper.converterEstadoModelParaDto(estado)).collect(Collectors.toList());
    }


    public List<RegiaoDto> listarRegioes() {
        return regiaoRepository.findAll().stream().map(regiao -> this.regiaoMapper.converterRegiaoModelParaDto(regiao))
                                                                    .collect(Collectors.toList());
    }

    public RegiaoDto obterRegiaoPorId(Integer idRegiao) {
        return this.regiaoMapper.converterRegiaoModelParaDto(this.regiaoRepository.findById(idRegiao).orElse(null));
    }

    public RegiaoDto obterRegiaoPorNome(String nomeRegiao) {
        Regiao regiaoPesquisada = new Regiao();
        regiaoPesquisada.setNomeRegiao(nomeRegiao);
        return this.regiaoMapper.converterRegiaoModelParaDto(this.regiaoRepository.findBy(Example.of(regiaoPesquisada), regiao -> regiao.first().orElse(null)));
    }
}
