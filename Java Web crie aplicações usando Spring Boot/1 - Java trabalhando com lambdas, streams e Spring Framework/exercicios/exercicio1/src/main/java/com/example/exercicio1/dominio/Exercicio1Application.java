package com.example.exercicio1.dominio;

import ch.qos.logback.core.net.ObjectWriter;
import ch.qos.logback.core.net.ObjectWriterFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.transform.Source;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Exercicio1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Digite um numero: ");
//		int num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}

		ObjectMapper objectMapper = new ObjectMapper();

//		Tarefa tarefa = new Tarefa("Lucas", "Fazer Exercicio 3", true);
//		objectMapper.writeValue(new File("tarefa.json"), tarefa);
//		System.out.println("Valores incluidos!");
//
//		Tarefa tarefa1 = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
//		System.out.println("Tarefa Lida: ");
//		System.out.println(tarefa1);


		Produto produto = new Produto("Bola", 10);
		Assinatura assinatura = new Assinatura("Disney", 120);
		Servico servico = new Servico("blabla", 500);


		Avaliacao<Produto> avaliacao = new Avaliacao<>(produto, 5, "Melhore");
		Avaliacao<Assinatura> assinaturaAvaliacao = new Avaliacao<>(assinatura, 10, "Bom");
		Avaliacao<Servico> servicoAvaliacao = new Avaliacao<>(servico, 10, "Bom");


		List<Avaliacao<?>> avaliacoes = new ArrayList<>();
		avaliacoes.add(avaliacao);
		avaliacoes.add(assinaturaAvaliacao);
		avaliacoes.add(servicoAvaliacao);

		objectMapper.writeValue(new File("avaliacoes.json"), avaliacoes);













	}
}
