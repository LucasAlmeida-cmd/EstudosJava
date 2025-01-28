package com.example.exercicio3;

import com.example.exercicio3.dominio.Pessoa;
import com.example.exercicio3.dominio.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Exercicio3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//1
//		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//		numeros.stream()
//				.filter(n -> n % 2 == 0)
//				.forEach(System.out::println);

		//2
//		List<String> palavras = Arrays.asList("java", "stream", "lambda");
//		palavras.stream()
//				.map(String::toUpperCase)
//				.forEach(System.out::println);

		//3
//		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//		List<Integer> numerosFiltrados = numeros.stream()
//				.filter(n -> n % 2 != 0)
//				.map(n -> n*2)
//				.collect(Collectors.toList());
//
//		System.out.println(numerosFiltrados);

		//4
//		List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
//		List<String> palavrasFiltradas = palavras.stream()
//				.distinct()
//				.collect(Collectors.toList());
//
//		System.out.println(palavrasFiltradas);

		//5
//		List<List<Integer>> listaDeNumeros = Arrays.asList(
//				Arrays.asList(1, 2, 3, 4),
//				Arrays.asList(5, 6, 7, 8),
//				Arrays.asList(9, 10, 11, 12)
//		);
//
//		List<Integer> listaPrimos = listaDeNumeros.stream()
//				.flatMap(l -> l.stream()
//						.filter(n -> {
//							for (int i = 2; i <= Math.sqrt(n); i++) {
//								if (n % i != 0) {
//
//								}
//							}
//						})
//						)

		//6
//		List<Pessoa> pessoas = Arrays.asList(
//				new Pessoa("Alice", 22),
//				new Pessoa("Bob", 17),
//				new Pessoa("Charlie", 19)
//		);
//
//		pessoas.stream()
//				.filter(p -> p.getIdade() > 18 )
//				.map(Pessoa::getNome)
//				.sorted()
//				.forEach(System.out::println);


		//7
//		List<Produto> produtos = Arrays.asList(
//				new Produto("Smartphone", 800.0, "Eletrônicos"),
//				new Produto("Notebook", 1500.0, "Eletrônicos"),
//				new Produto("Teclado", 200.0, "Eletrônicos"),
//				new Produto("Cadeira", 300.0, "Móveis"),
//				new Produto("Monitor", 900.0, "Eletrônicos"),
//				new Produto("Mesa", 700.0, "Móveis")
//		);
//
//		List<Produto> produtosEletronicos = produtos.stream()
//						.filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos") && p.getPreco() < 1000)
//						.sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
//						.collect(Collectors.toList());
//		System.out.println(produtosEletronicos);


		//8
				List<Produto> produtos = Arrays.asList(
				new Produto("Smartphone", 800.0, "Eletrônicos"),
				new Produto("Notebook", 1500.0, "Eletrônicos"),
				new Produto("Teclado", 200.0, "Eletrônicos"),
				new Produto("Cadeira", 300.0, "Móveis"),
				new Produto("Monitor", 900.0, "Eletrônicos"),
				new Produto("Mesa", 700.0, "Móveis")
		);

		List<Produto> produtosEletronicos = produtos.stream()
						.filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos") && p.getPreco() < 1000)
						.sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
						.limit(3)
						.collect(Collectors.toList());
		System.out.println(produtosEletronicos);


	}
}
