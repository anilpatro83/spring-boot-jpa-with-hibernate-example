package com.example.springjpa.springbootjpawithhibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.springjpa.springbootjpawithhibernateexample.dto.repository")
public class SpringBootJpaWithHibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaWithHibernateExampleApplication.class, args);
	}

}
