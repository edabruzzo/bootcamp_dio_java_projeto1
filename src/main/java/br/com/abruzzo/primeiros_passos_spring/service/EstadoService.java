package br.com.abruzzo.primeiros_passos_spring.service;

import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.dto.mappers.EstadoMapper;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// https://www.baeldung.com/hibernate-initialize-proxy-exception
@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private EstadoMapper estadoMapper;
    public List<EstadoDto> obterTodosEstados() {
        return estadoRepository.findAll().stream().map(EstadoMapper::converterEstadoModelParaDto).collect(Collectors.toList());
    }

    public EstadoDto obterEstadoBySigla(String sigla){
        Estado estadoExample = new Estado();
        estadoExample.setSiglaEstado(sigla);
        Estado estadoEncontrado = estadoRepository.findBy(Example.of(estadoExample), estado -> estado.first().orElse(null));
        return EstadoMapper.converterEstadoModelParaDto(estadoEncontrado);
    }
}
