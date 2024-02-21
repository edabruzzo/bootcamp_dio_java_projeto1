package br.com.abruzzo.primeiros_passos_spring.service;

import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.dto.mappers.EstadoMapper;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.repository.EstadoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// https://www.baeldung.com/hibernate-initialize-proxy-exception
@Service
public class EstadoService {

    Logger logger = LoggerFactory.getLogger(EstadoService.class);

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private EstadoMapper estadoMapper;
    public List<EstadoDto> obterTodosEstados() {
        return estadoRepository.findAll().stream().map(estado -> this.estadoMapper.converterEstadoModelParaDto(estado)).collect(Collectors.toList());
    }

    public EstadoDto obterEstadoBySigla(String sigla){
        Estado estadoExample = new Estado();
        estadoExample.setSiglaEstado(sigla);
        Estado estadoEncontrado = estadoRepository.findBy(Example.of(estadoExample), estado -> estado.first().orElse(null));
        return this.estadoMapper.converterEstadoModelParaDto(estadoEncontrado);
    }

    public EstadoDto obterEstadoPorId(Integer idEstado) {
        return this.estadoMapper.converterEstadoModelParaDto(this.estadoRepository.findById(idEstado).orElse(null));
    }

    public void deletarEstado(Integer idEstado){
        this.estadoRepository.deleteById(idEstado);
    }

    public EstadoDto inserirEstado(EstadoDto estadoDto) {
        Estado estadoInserido = null;
        try{
            estadoInserido = this.estadoRepository.save(this.estadoMapper.converterEstadoDtoParaModel(estadoDto));
            return this.estadoMapper.converterEstadoModelParaDto(estadoInserido);
        }catch(Exception e){
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    public EstadoDto deletarEstadoPorNome(String nomeEstado) {
        EstadoDto estadoASerDeletado = this.obterEstadoByNome(nomeEstado);
        estadoRepository.deleteById(estadoASerDeletado.getIdEstado());
        return estadoASerDeletado;
    }

    public EstadoDto obterEstadoByNome(String nomeEstado){
        Estado estadoExample = new Estado();
        estadoExample.setNomeEstado(nomeEstado);
        Estado estadoEncontrado = estadoRepository.findBy(Example.of(estadoExample), estado -> estado.first().orElse(null));
        return this.estadoMapper.converterEstadoModelParaDto(estadoEncontrado);
    }
}
