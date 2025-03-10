package com.example.exercicio4;

import com.example.exercicio4.dominio.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Exercicio4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//1
//		List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
//		Optional<Integer> max = numeros.stream().max(Integer::compare);
//		System.out.println(max);

		//2
//		List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
//		Map<Integer, List<String>> agrupamento = palavras.stream()
//				.collect(Collectors.groupingBy(String::length));
//		System.out.println(agrupamento);

		//3
//		List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
//		String resultado = nomes.stream()
//				.collect(Collectors.joining(", "));
//		System.out.println(resultado);

		//4
//		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//		int soma = numeros.stream()
//				.filter(p -> p % 2 == 0)
//				.map(n -> n*n)
//				.reduce(0, Integer::sum);
//		System.out.println(soma);

		//5
//		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//		Map<Boolean, List<Integer>> particionado = numeros.stream()
//				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
//		System.out.println("Pares: " + particionado.get(true));  // Esperado: [2, 4, 6]
//		System.out.println("Ímpares: " + particionado.get(false));


		List<Produto> produtos = Arrays.asList(
				new Produto("Smartphone", 800.0, "Eletrônicos"),
				new Produto("Notebook", 1500.0, "Eletrônicos"),
				new Produto("Teclado", 200.0, "Eletrônicos"),
				new Produto("Cadeira", 300.0, "Móveis"),
				new Produto("Monitor", 900.0, "Eletrônicos"),
				new Produto("Mesa", 700.0, "Móveis")
		);

//		List<Produto> produtosFiltrados = produtos.stream()
//				.filter(n -> n.getCategoria().equalsIgnoreCase("Eletrônicos") && n.getPreco() < 1000)
//				.sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
//				.collect(Collectors.toList());

		//6
//		Map<String, List<Produto>> categorias = produtos.stream()
//				.collect(Collectors.groupingBy(Produto::getCategoria));
//		System.out.println(categorias);

		//7
//		Map<String, Long> quantidadeProdutos = produtos.stream()
//				.collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
//		System.out.println(quantidadeProdutos);

		//8
//		Map<String, Optional<Produto>> produtoMaisCaraPorCategoria = produtos.stream()
//				.collect(Collectors.groupingBy(Produto::getCategoria,
//						Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
//		System.out.println(produtoMaisCaraPorCategoria);

		//9
//		Map<String, Double> somaTotalPrecos = produtos.stream()
//				.collect(Collectors.groupingBy(Produto::getCategoria , Collectors.summingDouble(Produto::getPreco)));
//
//		System.out.println(somaTotalPrecos	);


	}
}
