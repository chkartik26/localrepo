package net.javaguides.springboot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Course API",version = "2.0",description ="Courses Information"))
public class SpringbootBackendApplication {

	public static void main(String[] args)  {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
