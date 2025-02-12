package com.example.exercicio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

@SpringBootApplication
public class Exercicio1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//1
		List<String> input = Arrays.asList("10", "abc", "20", "30x");
		input.stream()
				.forEach(p -> );


	}
}
