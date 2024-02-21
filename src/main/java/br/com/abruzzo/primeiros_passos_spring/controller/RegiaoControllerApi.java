package br.com.abruzzo.primeiros_passos_spring.controller;


import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import br.com.abruzzo.primeiros_passos_spring.service.RegiaoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/regioes")
public class RegiaoControllerApi {

    @Autowired
    RegiaoService regiaoService;

    @GetMapping
    public List<RegiaoDto> listarRegioes(){
        return regiaoService.listarRegioes();
    }

    @GetMapping("/{nomeRegiao}/estados")
    public List<EstadoDto> listarEstadosPorRegiao(@PathVariable("nomeRegiao") String nomeRegiao){
        return regiaoService.obterEstadosPorRegiao(nomeRegiao);
    }

}
