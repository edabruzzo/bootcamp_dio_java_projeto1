package br.com.abruzzo.primeiros_passos_spring.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "tb_regiao")
@NamedQuery(name = "Regiao.findEstadosByNomeRegiao",
        query = "select r.listaEstados from Regiao r WHERE r.nomeRegiao=:nomeRegiao") // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
@NoArgsConstructor
@AllArgsConstructor // https://www.baeldung.com/intro-to-project-lombok
public class Regiao implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegiao;

    @Column(length = 2, nullable = false)
    private String codRegiao;

    @Column(length = 20, nullable = false)
    private String nomeRegiao;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "regiao")
    private List<Estado> listaEstados;

    @Override
    public String toString() {
        return "Regiao{" +
                "idRegiao=" + idRegiao +
                ", codRegiao='" + codRegiao + '\'' +
                ", nomeRegiao='" + nomeRegiao + '\'' +
                '}';
    }
}
