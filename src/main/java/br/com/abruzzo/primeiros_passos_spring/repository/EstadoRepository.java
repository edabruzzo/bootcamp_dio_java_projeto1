package br.com.abruzzo.primeiros_passos_spring.repository;

import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {}
