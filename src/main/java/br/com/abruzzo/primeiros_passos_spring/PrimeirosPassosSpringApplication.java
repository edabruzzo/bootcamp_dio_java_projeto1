package br.com.abruzzo.primeiros_passos_spring;

import br.com.abruzzo.primeiros_passos_spring.app.ConversorJson;
import br.com.abruzzo.primeiros_passos_spring.mensagens.MensagensService;
import br.com.abruzzo.primeiros_passos_spring.service.EstadoService;
import br.com.abruzzo.primeiros_passos_spring.service.RegiaoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosSpringApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor, MensagensService mensagensService, EstadoService estadoService, RegiaoService regiaoService){
		return args ->{

			/*

			estadoService.obterTodosEstados().stream().forEach(System.out::println);
			String json = "{\"cep\":\"09999-999\", \"logradouro\":\"Rua Aurora\"}";
			mensagensService.enviarMensagem(conversor.converter(json));

			System.out.println("ESTADOS DO NORDESTE:");
			regiaoService.obterEstadosPorRegiao("Nordeste").stream().forEach(System.out::println);

			System.out.println("ESTADOS DO NORTE:");
			regiaoService.obterEstadosPorRegiao("Norte").stream().forEach(System.out::println);

			System.out.println("ESTADOS DO CENTRO-OESTE:");
			regiaoService.obterEstadosPorRegiao("Centro-Oeste").stream().forEach(System.out::println);

			System.out.println("ESTADOS DO SUDESTE:");
			regiaoService.obterEstadosPorRegiao("Sudeste").stream().forEach(System.out::println);


			System.out.println("ESTADOS DO SUL:");
			regiaoService.obterEstadosPorRegiao("Sul").stream().forEach(System.out::println);

			*/
		};
	}

}
