package br.com.abruzzo.primeiros_passos_spring.controller;


import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// https://spring.io/guides/gs/testing-web
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EstadoControllerApiTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String urlBase = "http://localhost:";

    private String endpoint = "estados";
    private String endpointRegiao = "regioes";

    @Test
    void listarEstados() {
        List<EstadoDto> listaEstados = this.restTemplate.getForObject(urlBase + port + "/" + endpoint,
                ArrayList.class);
        assertThat(listaEstados).size().isEqualTo(27);

    }

    @Test
    void obterEstadoPorSigla() {
        String sigla = "SP";
        String endpointTeste = urlBase + port + "/" + endpoint + "/sigla/" + sigla;
        EstadoDto estadoDto = this.restTemplate.getForObject(endpointTeste,
                EstadoDto.class);
        assertThat(estadoDto).isNotNull();
        assertThat(estadoDto.getNomeEstado()).isEqualTo("São Paulo");
    }

    @Test
    void verificaQue_retornaNulo_quandoPesquisadaSiglaInexistente() {
        String sigla = "XXXXXXX";
        String endpointTeste = urlBase + port + "/" + endpoint + "/sigla/" + sigla;
        EstadoDto estadoDto = this.restTemplate.getForObject(endpointTeste,
                EstadoDto.class);
        assertThat(estadoDto).isNull();
    }


    @Test
    void deletarEstado(){
        String nomeEstado = "Acre";
        String endpointTeste = urlBase + port + "/" + endpoint + "/nomeEstado/" + nomeEstado;
        this.restTemplate.delete(endpointTeste);
        List<EstadoDto> listaEstados = this.restTemplate.getForObject(urlBase + port + "/" + endpoint,
                ArrayList.class);
        assertThat(listaEstados).size().isEqualTo(26);
        EstadoDto estado = this.restTemplate.getForObject(urlBase + port + "/" + endpoint + "/1",
                EstadoDto.class);
        assertThat(estado).isNull();
    }

    @Test
    void inserirEstado(){
        deletarEstado();
        String endpointTeste = urlBase + port + "/" + endpoint;
        EstadoDto estadoDto = new EstadoDto();
        estadoDto.setIdEstado(1);
        estadoDto.setSiglaEstado("AC");
        estadoDto.setNomeEstado("Acre");
        estadoDto.setNomeCapital("Rio Branco");

        RegiaoDto regiao = this.restTemplate.getForObject(urlBase + port + "/" + endpointRegiao + "/nomeRegiao" + "/Norte",
                RegiaoDto.class);

        estadoDto.setIdregiao(regiao.getIdRegiao());
        ResponseEntity<EstadoDto> responseEstadoInserido = this.restTemplate.postForEntity(endpointTeste, estadoDto, EstadoDto.class);
        assertThat(responseEstadoInserido.getStatusCode()).isEqualTo(HttpStatusCode.valueOf(200));
        assertThat(responseEstadoInserido.getBody().getNomeEstado()).isEqualTo("Acre");
        EstadoDto estado = this.restTemplate.getForObject(urlBase + port + "/" + endpoint + "/" + responseEstadoInserido.getBody().getIdEstado(),
                EstadoDto.class);
        assertThat(estado).isNotNull();
        assertThat(estado.getNomeEstado()).isEqualTo("Acre");
    }



}
