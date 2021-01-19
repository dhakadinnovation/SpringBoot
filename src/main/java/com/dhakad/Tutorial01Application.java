package com.dhakad;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Explore California API",
				description = "API Definitions of the Microservice",
				version = "3.0.1"

		))
public class Tutorial01Application {

	public static void main(String[] args) {
		SpringApplication.run(Tutorial01Application.class, args);
	}

	@Bean
	public WebMvcConfigurer configurer()
	{
    return new WebMvcConfigurer() {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/*").allowedOrigins("http://localhost:9999");
		}
	};
	};

}
