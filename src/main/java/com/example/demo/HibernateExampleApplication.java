package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages={"com.example.demo"})
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class HibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateExampleApplication.class, args);
	}

}
