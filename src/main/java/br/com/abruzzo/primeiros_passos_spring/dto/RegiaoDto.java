package br.com.abruzzo.primeiros_passos_spring.dto;

import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

// https://www.baeldung.com/lombok-builder

import lombok.*;

// https://www.baeldung.com/lombok-builder-custom-setter
// https://projectlombok.org/features/Builder
@Data
@Builder
@AllArgsConstructor
public class RegiaoDto {

    private Integer idRegiao;
    private String codRegiao;
    private String nomeRegiao;
    private List<Integer> listaIdEstados;

/*
    public RegiaoDto(Integer idRegiao, String codRegiao, String nomeRegiao, List<EstadoDto> listaEstados) {
        this.idRegiao = idRegiao;
        this.codRegiao = codRegiao;
        this.nomeRegiao = nomeRegiao;
        this.listaEstados = listaEstados;
    }

    public static class Builder {

        private Integer idRegiao;
        private String codRegiao;
        private String nomeRegiao;
        private List<EstadoDto> listaEstados;


        public Builder idRegiao(Integer idRegiao) {
            this.idRegiao = idRegiao;
            return this;
        }

        public Builder codRegiao(String codRegiao) {
            this.codRegiao = codRegiao;
            return this;
        }

        public Builder nomeRegiao(String nomeRegiao) {
            this.nomeRegiao = nomeRegiao;
            return this;
        }

        public Builder listaEstados(List<EstadoDto> listaEstados) {
            this.listaEstados = listaEstados;
            return this;
        }
        public RegiaoDto build(){
            return new RegiaoDto(idRegiao, codRegiao, nomeRegiao, listaEstados);
        }
    }
*/
}
