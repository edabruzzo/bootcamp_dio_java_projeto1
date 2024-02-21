package br.com.abruzzo.primeiros_passos_spring.dto.mappers;

import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.model.Regiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EstadoMapper {


    public static EstadoDto converterEstadoModelParaDto(Estado estado) {
        return EstadoDto.builder()
                .idEstado(estado.getIdEstado())
                .nomeEstado(estado.getNomeEstado())
                .siglaEstado(estado.getSiglaEstado())
                .nomeCapital(estado.getNomeCapital())
                .build();
    }
}
