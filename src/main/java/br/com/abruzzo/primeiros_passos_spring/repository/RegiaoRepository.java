package br.com.abruzzo.primeiros_passos_spring.repository;

import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.model.Regiao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Integer> {

    public List<Estado> findEstadosByNomeRegiao(String nomeRegiao);

}
