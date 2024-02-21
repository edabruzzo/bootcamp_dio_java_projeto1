package br.com.abruzzo.primeiros_passos_spring.dto.mappers;

import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.model.Regiao;
import br.com.abruzzo.primeiros_passos_spring.repository.EstadoRepository;
import br.com.abruzzo.primeiros_passos_spring.repository.RegiaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class EstadoMapper {

    @Autowired
     EstadoRepository estadoRepository;

    @Autowired
     RegiaoRepository regiaoRepository;

    public  EstadoDto converterEstadoModelParaDto(Estado estado) {
        EstadoDto estadoDto = (Objects.nonNull(estado)) ? EstadoDto.builder()
                .idEstado(estado.getIdEstado())
                .nomeEstado(estado.getNomeEstado())
                .siglaEstado(estado.getSiglaEstado())
                .nomeCapital(estado.getNomeCapital())
                .idregiao((Objects.nonNull(estado.getRegiao())) ? estado.getRegiao().getIdRegiao() : null)
                .build() : null;
        return estadoDto;
    }

    public  Estado converterEstadoDtoParaModel(EstadoDto estadoDto) {
        return Estado.builder()
                .nomeEstado(estadoDto.getNomeEstado())
                .idEstado(estadoDto.getIdEstado())
                .siglaEstado(estadoDto.getSiglaEstado())
                .nomeCapital(estadoDto.getNomeCapital())
                .nomeEstado(estadoDto.getNomeEstado())
                .regiao(regiaoRepository.findById(estadoDto.getIdregiao()).orElse(null))
                .build();
    }

    public  Estado obterEstadoById(Integer id) {
        return estadoRepository.findById(id).orElse(null);
    }
}
