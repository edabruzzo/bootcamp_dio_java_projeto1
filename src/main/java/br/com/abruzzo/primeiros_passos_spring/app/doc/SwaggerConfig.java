package br.com.abruzzo.primeiros_passos_spring.app.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

    private String title = "Base Geográfica";
    private String description = "Informações Geográficas - Operações com dados geográficos do Brasil";
    private String version = "1.0";
    private String termsOfServiceUrl = "";
//    private Contact contact = this.contato();
    private String license = "MIT";
    String licenseUrl = "";
    //Collection<VendorExtension> vendorExtensions = new ArrayList<>();
    private String desenvolvedor = "Emmanuel Abruzzo";
    private String linkedinDesenvolvedor = "https://www.linkedin.com/in/emmanuel-abruzzo-%F0%9F%87%AE%F0%9F%87%B9-%F0%9F%87%A7%F0%9F%87%B7-8ba80a36/";

    private String emailDesenvolvedor = "emmanuel.oliveira3@gmail.com";

    /*
    private Contact contato(){
        return new Contact(
                this.desenvolvedor,
                this.linkedinDesenvolvedor,
                this.emailDesenvolvedor
        );
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")))
                .apiInfo(new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl, vendorExtensions))
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.abruzzo.primeiros_passos_spring.controller"))
                .paths(PathSelectors.any())
                .build();
    }


     */
}
