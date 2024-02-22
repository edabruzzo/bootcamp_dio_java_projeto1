package br.com.abruzzo.primeiros_passos_spring.app.doc;

import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Configuration;


/*

https://swagger.io/docs/specification/api-host-and-base-path/
https://idratherbewriting.com/learnapidoc/pubapis_openapi_tutorial_overview

*/
@Configuration
public class SwaggerConfig {

    private String title = "Base Geográfica";
    private String description = "Informações Geográficas - Operações com dados geográficos do Brasil";
    private String version = "1.0";
    private String termsOfServiceUrl = "http://springfox.io";
    private Contact contact = this.contato();
    private String license = "Apache License Version 2.0";
    String licenseUrl = "https://github.com/springfox/springfox/blob/master/LICENSE";
    private String desenvolvedor = "Emmanuel Abruzzo";
    private String linkedinDesenvolvedor = "https://www.linkedin.com/in/emmanuel-abruzzo-%F0%9F%87%AE%F0%9F%87%B9-%F0%9F%87%A7%F0%9F%87%B7-8ba80a36/";

    private String emailDesenvolvedor = "emmanuel.oliveira3@gmail.com";

    private Contact contato(){
        return new Contact().email(this.emailDesenvolvedor)
                .url(this.linkedinDesenvolvedor)
                .name(this.desenvolvedor);
    }

/*
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")))
                .apiInfo(new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl, vendorExtensions))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

 */

}
