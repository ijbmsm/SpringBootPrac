package com.kosta.SpringBootPrac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EntityScan("com.kosta")
public class SpringBootPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracApplication.class, args);
	}

}
