package br.com.abruzzo.primeiros_passos_spring.controller;


import br.com.abruzzo.primeiros_passos_spring.dto.EstadoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

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


}
