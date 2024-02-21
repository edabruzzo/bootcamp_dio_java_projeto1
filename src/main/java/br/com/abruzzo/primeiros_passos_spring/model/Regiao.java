package br.com.abruzzo.primeiros_passos_spring.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.util.List;

/*
https://developer.jboss.org/thread/109197
 */
@Entity
@Getter
@Setter
@Table(name = "tb_regiao")
@NamedQuery(name = "Regiao.findEstadosByNomeRegiao",
        query = "select r.listaEstados from Regiao r WHERE r.nomeRegiao=:nomeRegiao") // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
@NoArgsConstructor
@AllArgsConstructor // https://www.baeldung.com/intro-to-project-lombok
@Builder
public class Regiao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegiao;

    @Column(length = 2, nullable = false)
    private String codRegiao;

    @Column(length = 20, nullable = false)
    private String nomeRegiao;

    @OneToMany(mappedBy = "regiao", fetch = FetchType.EAGER, cascade= CascadeType.REMOVE)
    //@JsonManagedReference // Tentando evitar dependência circular no mapeamento de DTOs
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
