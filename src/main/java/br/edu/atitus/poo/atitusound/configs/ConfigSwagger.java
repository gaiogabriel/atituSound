package br.edu.atitus.poo.atitusound.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class ConfigSwagger {

	@Bean
	public OpenAPI getOpenAPI(){
		return new OpenAPI()
				.info(new Info()
						.title("Atitu Sound")
						.description("Documentaçao")
						.version("1.0.0")
						.contact(new Contact()
								.name("Devs: Matheus Durante, Gabriel Gaio")
								.email("matheusdurante9@gmail.com")));
	}
}
