package br.com.abruzzo.primeiros_passos_spring.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;

import static jakarta.persistence.ConstraintMode.CONSTRAINT;

/*
https://stackoverflow.com/questions/63789754/hibernate-mapping-manytoone-only-to-foreign-key-entities-with-particular-column
 */
@Entity
@Getter
@Setter
@Table(name = "tb_estado")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Estado {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEstado;

    @Column(length = 2, nullable = false)
    private String siglaEstado;
    @Column(length = 20, nullable = false)
    private String nomeEstado;

    @Column(length = 20, nullable = false)
    private String nomeCapital;

    /*
    https://www.tutorialspoint.com/jpa/jpa_entity_relationships.htm
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
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
