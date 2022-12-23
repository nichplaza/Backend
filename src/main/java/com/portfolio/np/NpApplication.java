package com.portfolio.np;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages ="com.solution.controller,"
		+ "+com.solution.np.service")
public class NpApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpApplication.class, args);
	}

}
