package br.com.abruzzo.primeiros_passos_spring.dto;


// https://www.baeldung.com/lombok-builder

import lombok.*;


@Data
@Builder // https://www.baeldung.com/lombok-builder-custom-setter
@AllArgsConstructor
public class EstadoDto {

    private Integer idEstado;
    private String siglaEstado;
    private String nomeEstado;
    private String nomeCapital;


    /*

        public EstadoDto(Integer idEstado, String siglaEstado, String nomeEstado, String nomeCapital) {
        this.idEstado = idEstado;
        this.siglaEstado = siglaEstado;
        this.nomeEstado = nomeEstado;
        this.nomeCapital = nomeCapital;
    }

    public static class Builder {

        private Integer idEstado;
        private String siglaEstado;
        private String nomeEstado;
        private String nomeCapital;

        public Builder idEstado(Integer idEstado) {
            this.idEstado = idEstado;
            return this;
        }

        public Builder siglaEstado(String siglaEstado){
            this.siglaEstado = siglaEstado;
            return this;
        }

        public Builder nomeEstado(String nomeEstado){
            this.nomeEstado = nomeEstado;
            return this;
        }

        public Builder nomeCapital(String nomeCapital){
            this.nomeCapital = nomeCapital;
            return this;
        }

        public EstadoDto build(){
            return new EstadoDto(idEstado, siglaEstado, nomeEstado, nomeCapital);
        }
    }
 */
}
