package br.com.abruzzo.primeiros_passos_spring.dto.mappers;

import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.model.Regiao;
import br.com.abruzzo.primeiros_passos_spring.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RegiaoMapper {

    @Autowired
    EstadoMapper estadoMapper;

    public RegiaoDto converterRegiaoModelParaDto(Regiao regiao){
        return RegiaoDto.builder()
                .idRegiao(regiao.getIdRegiao())
                .codRegiao(regiao.getCodRegiao())
                .nomeRegiao(regiao.getNomeRegiao())
                .listaIdEstados(regiao.getListaEstados().stream().map(RegiaoMapper::obterIdEstados).collect(Collectors.toList()))
                .build();
    }

    private static Integer obterIdEstados(Estado estado) {
        return estado.getIdEstado();
    }

    public  Regiao converterDtoParaModel(RegiaoDto regiaoDto) {
        return Regiao.builder()
                .idRegiao(regiaoDto.getIdRegiao())
                .codRegiao(regiaoDto.getCodRegiao())
                .nomeRegiao(regiaoDto.getNomeRegiao())
                .listaEstados(regiaoDto.getListaIdEstados().stream().map(
                        idEstado -> this.estadoMapper.obterEstadoById(idEstado))
                        .collect(Collectors.toList()))
                .build();
    }
}
