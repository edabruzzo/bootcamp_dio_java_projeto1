package br.com.abruzzo.primeiros_passos_spring.controller;

import br.com.abruzzo.primeiros_passos_spring.dto.RegiaoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// https://www.baeldung.com/integration-testing-a-rest-api
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RegiaoControllerApiTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private String urlBase = "http://localhost:";

    private String endpoint = "regioes";

    @Test
    void listarRegioes() {
        List<RegiaoDto> listaRegioes = this.restTemplate.getForObject(urlBase + port + "/" + endpoint,
                ArrayList.class);
        assertThat(listaRegioes).size().isEqualTo(5);

    }
}