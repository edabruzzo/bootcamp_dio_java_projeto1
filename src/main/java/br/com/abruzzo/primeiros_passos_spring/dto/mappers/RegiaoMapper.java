package br.com.abruzzo.primeiros_passos_spring.dto.mappers;

import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import br.com.abruzzo.primeiros_passos_spring.model.Regiao;
import org.springframework.stereotype.Component;

@Component
public class RegiaoMapper {

    public static RegiaoDto converterRegiaoModelParaDto(Regiao regiao){
        return RegiaoDto.builder()
                .idRegiao(regiao.getIdRegiao())
                .codRegiao(regiao.getCodRegiao())
                .nomeRegiao(regiao.getNomeRegiao())
                .build();

    }
}
