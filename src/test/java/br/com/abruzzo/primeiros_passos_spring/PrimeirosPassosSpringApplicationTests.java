package br.com.abruzzo.primeiros_passos_spring;

import br.com.abruzzo.primeiros_passos_spring.controller.RegiaoControllerApi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PrimeirosPassosSpringApplicationTests {

	@Autowired
	RegiaoControllerApi regiaoControllerApi;

	@Test
	void contextLoads() {
		assertThat(regiaoControllerApi).isNotNull();
	}

}
