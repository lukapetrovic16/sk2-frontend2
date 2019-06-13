package sk2.sk2frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "reserve", lazyInit = true)
public class Sk2FrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sk2FrontendApplication.class, args);
	}

}
