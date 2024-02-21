package br.com.abruzzo.primeiros_passos_spring.dto.mappers;

import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import br.com.abruzzo.primeiros_passos_spring.model.Regiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RegiaoMapper {

    public static RegiaoDto converterRegiaoModelPa1raDto(Regiao regiao){
        return RegiaoDto.builder()
                .idRegiao(regiao.getIdRegiao())
                .codRegiao(regiao.getCodRegiao())
                .nomeRegiao(regiao.getNomeRegiao())
                .build();

    }
}
