package it.develhope.Swagger1.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class SpringDocConfig {
@Bean
    public OpenAPI baseOpenApi(){
    return new OpenAPI().info(new Info().title("Spring Doc").version("1.0.0").description("Swagger example"));
    }
}
//fixme how to insert method tags in this config file?