package br.com.abruzzo.primeiros_passos_spring.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "tb_estado")
@NoArgsConstructor
@AllArgsConstructor
public class Estado implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;

    @Column(length = 2, nullable = false)
    private String siglaEstado;
    @Column(length = 20, nullable = false)
    private String nomeEstado;

    @Column(length = 20, nullable = false)
    private String nomeCapital;

    @ManyToOne
    @JoinColumn(name = "idRegiao", referencedColumnName = "idRegiao")
    private Regiao regiao;

    @Override
    public String toString() {
        return "Estado{" +
                "idEstado=" + idEstado +
                ", siglaEstado='" + siglaEstado + '\'' +
                ", nomeEstado='" + nomeEstado + '\'' +
                ", nomeCapital='" + nomeCapital + '\'' +
                '}';
    }
}
