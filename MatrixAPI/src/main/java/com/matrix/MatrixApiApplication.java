package com.matrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatrixApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatrixApiApplication.class, args);
		System.out.println("Welcome to MatrixAPI");
	}

}
