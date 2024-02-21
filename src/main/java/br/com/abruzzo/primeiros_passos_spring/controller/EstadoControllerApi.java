package br.com.abruzzo.primeiros_passos_spring.controller;

import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.model.Estado;
import br.com.abruzzo.primeiros_passos_spring.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // https://zetcode.com/spring/deletemapping/
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

    @GetMapping("/{idEstado}")
    public EstadoDto obterEstadoPorId(@PathVariable("idEstado") Integer idEstado){
        return this.estadoService.obterEstadoPorId(idEstado);
    }

    @DeleteMapping("/{idEstado}")
    public ResponseEntity<Integer> deletarEstadoPorId(@PathVariable("idEstado") Integer idEstado){
        this.estadoService.deletarEstado(idEstado);
        ResponseEntity<Integer> resposta = new ResponseEntity<Integer>(idEstado, HttpStatus.OK);
        return resposta;
    }

    @DeleteMapping("/nomeEstado/{nomeEstado}")
    public ResponseEntity<EstadoDto> deletarEstadoPorId(@PathVariable("nomeEstado") String nomeEstado){
        EstadoDto estadoDto = this.estadoService.deletarEstadoPorNome(nomeEstado);
        ResponseEntity<EstadoDto> resposta = new ResponseEntity<EstadoDto>(estadoDto, HttpStatus.OK);
        return resposta;
    }

    @PostMapping // https://www.geeksforgeeks.org/spring-postmapping-and-getmapping-annotation/
    public ResponseEntity<EstadoDto> inserirEstado(@RequestBody EstadoDto estadoDto){
            EstadoDto estadoInserido = this.estadoService.inserirEstado(estadoDto);
            return new ResponseEntity<EstadoDto>(estadoInserido, HttpStatus.OK);
    }

}
