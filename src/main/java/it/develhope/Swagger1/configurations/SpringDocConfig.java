package it.develhope.Swagger1.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaml.snakeyaml.nodes.Tag;

import java.util.List;

@OpenAPIDefinition
@Configuration
public class SpringDocConfig {
@Bean
    public OpenAPI baseOpenApi(){
    return new OpenAPI().info(new Info().title("Exercise Swagger-01")
                    .version("1.0.0")
                    .description("An exercise illustrating Swagger")
                    .contact(new Contact()
                            .name("Alessio Limina")
                            .email("alessio.limina@gmail.com")
                            .url("https://www.develhope.co")))
                    .tags(List.of())
    }
}
//fixme how to insert method tags in this config file?