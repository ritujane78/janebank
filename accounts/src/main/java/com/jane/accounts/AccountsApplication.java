package com.jane.accounts;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.jane.accounts.controller") })
@EnableJpaRepositories("com.jane.accounts.repository")
@EntityScan("com.jane.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(info = @Info(
		title = "Account microservice REST APIs Documentation",
		description = "JaneBank account microservice REST API documentation",
		version = "v1",
		contact = @Contact(
			name = "Ritu Bafna",
			email = "rbafna.official@gmail.com",
			url = "https://www.efg.com"
		 ),
		license = @License(
				name = "Apache 2.0",
				url = "https://www.efg.com"
		)
))
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
