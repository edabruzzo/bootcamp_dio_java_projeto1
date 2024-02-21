package br.com.abruzzo.primeiros_passos_spring.controller;

import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estados")
public class EstadoControllerApi {

    @Autowired
    EstadoService estadoService;

    @GetMapping
    public List<EstadoDto> listarEstados(){
        return estadoService.obterTodosEstados();
    }

    @GetMapping("/sigla/{sigla}")
    public EstadoDto obterEstadoPorSigla(@PathVariable("sigla") String sigla){
        return this.estadoService.obterEstadoBySigla(sigla);
    }

}
