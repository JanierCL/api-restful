package com.example.api_restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import java.util.Locale;

/**Se importa la clase SpringApplication para iniciar la aplicación mediante import.org.springframework.boot.SpringApplication y mediante*/
/**import.org.springframtrfework.boot.autoconfigure.SpringApplication se importa la anotación @SpringBootApplication*/
/**que es una anotación compuesta para @Configuration, @EnableAutoConfiguration y @ComponentScan estos sirven para onfigurar Sping, */
/**habilita la configuración automática de Spring Boot y escanea los componentes en el paquete actual y subpaquetes.*/

@SpringBootApplication
public class ApiRestfulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiRestfulApplication.class, args);
	}

@Configuration
public class AppConfig {

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages"); // Nombre base de los archivos de propiedades
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
}

}






