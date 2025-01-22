package com.example.exercicio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Exercicio2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
	}

	@FunctionalInterface
	public interface Multiplicacao {
		int multiplicacao( int a, int b);
	}

	interface Primo {
		boolean verificarPrimo(int n);
	}

	interface Maiuscula{
		String maiuscula(String a);
	}

	interface Palindromo{
		boolean verificarPalindromo(String str);
	}

	interface Divide{
		int divide(int a, int b);
	}



	@Override
	public void run(String... args) throws Exception {
		//1
		Multiplicacao multiplicacao = (a, b) -> a * b;
		System.out.println(multiplicacao.multiplicacao(2,3));

		//2
		Primo primo = (a) -> {
			if (a <= 1) return false;
			for (int i = 2; i < Math.sqrt(a); i++) {
				if (a % i == 0 ){
					return false;
				}
			}
			return true;
		};
		System.out.println(primo.verificarPrimo(11));  // Resultado: true
		System.out.println(primo.verificarPrimo(12));  // Resultado: false

		//3
		Maiuscula transformaParaMaiuscula = String::toUpperCase;
		System.out.println(transformaParaMaiuscula.maiuscula("lucas"));

		//4
		Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
		System.out.println(palindromo.verificarPalindromo("radar"));  // Resultado: true
		System.out.println(palindromo.verificarPalindromo("java"));

		//5
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		numeros.replaceAll(n -> n * 3);
		System.out.println(numeros);

		//6
		List<String> nomes = Arrays.asList("Lucas", "Maria", "João", "Ana");
		nomes.sort(String::compareTo);
		System.out.println(nomes);

		//7
		Divide divide = (a, b) -> {
			if (b == 0) throw new ArithmeticException("Divisão por zero");
			return a/ b;
        };
		try {
			System.out.println(divide.divide(10, 2)); // Esperado: 5
			System.out.println(divide.divide(10, 0)); // Esperado: Exceção
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}



	}
}
