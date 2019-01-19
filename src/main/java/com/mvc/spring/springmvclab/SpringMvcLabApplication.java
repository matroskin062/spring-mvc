package com.mvc.spring.springmvclab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.mvc.spring.springmvclab.Controllers",
		"com.mvc.spring.springmvclab.Repositories",
		"com.mvc.spring.springmvclab.config"})
@SpringBootApplication
public class SpringMvcLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcLabApplication.class, args);
	}

}

