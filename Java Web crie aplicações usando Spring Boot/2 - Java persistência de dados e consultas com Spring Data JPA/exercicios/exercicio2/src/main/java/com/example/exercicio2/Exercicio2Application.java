package com.example.exercicio2;

import com.example.exercicio2.Principal.Principal;
import com.example.exercicio2.Repository.CategoriaRepository;
import com.example.exercicio2.Repository.FornecedorRepository;
import com.example.exercicio2.Repository.PedidoRepository;
import com.example.exercicio2.Repository.ProdutoRepository;
import com.example.exercicio2.model.Categoria;
import com.example.exercicio2.model.Fornecedor;
import com.example.exercicio2.model.Pedido;
import com.example.exercicio2.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Exercicio2Application implements CommandLineRunner {


	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private FornecedorRepository fornecedorRepository;


    public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Criando categorias
//		Categoria categoriaEletronicos = new Categoria(null, "Eletrônicos");
//		Categoria categoriaLivros = new Categoria(null, "Livros");
//		categoriaRepository.saveAll(List.of(categoriaEletronicos, categoriaLivros));
//
//		// Criando fornecedores
//		Fornecedor fornecedorTech = new Fornecedor("Tech Supplier");
//		Fornecedor fornecedorLivros = new Fornecedor("Livraria Global");
//		fornecedorRepository.saveAll(List.of(fornecedorTech, fornecedorLivros));
//
//		// Criando produtos
//		Produto produto1 = new Produto("Notebook", 3500.0, categoriaEletronicos);
//		Produto produto2 = new Produto("Smartphone", 2500.0, categoriaEletronicos);
//		Produto produto3 = new Produto("Livro de Java", 100.0, categoriaLivros);
//		produto1.setFornecedor(fornecedorTech);
//		produto2.setFornecedor(fornecedorTech);
//		produto3.setFornecedor(fornecedorLivros);
//		produtoRepository.saveAll(List.of(produto1, produto2, produto3));
//
//		// Criando pedidos e associando produtos
//		Pedido pedido1 = new Pedido(1L, LocalDate.now());
//		pedido1.setProdutos(List.of(produto1, produto3));
//		Pedido pedido2 = new Pedido(2L, LocalDate.now().minusDays(1));
//		pedido2.setProdutos(List.of(produto2));
//		pedidoRepository.saveAll(List.of(pedido1, pedido2));
//
//		// Testando consultas e verificando os relacionamentos
//		System.out.println("Produtos na categoria Eletrônicos:");
//		categoriaRepository.findById(1L).ifPresent(categoria ->
//				categoria.getProdutos().forEach(produto ->
//						System.out.println(" - " + produto.getNome())
//				)
//		);
//
//		System.out.println("\nPedidos e seus produtos:");
//		pedidoRepository.findAll().forEach(pedido -> {
//			System.out.println("Pedido " + pedido.getId() + ":");
//			pedido.getProdutos().forEach(produto ->
//					System.out.println(" - " + produto.getNome())
//			);
//		});
//
//		System.out.println("\nProdutos e seus fornecedores:");
//		produtoRepository.findAll().forEach(produto ->
//				System.out.println("Produto: " + produto.getNome() +
//						", Fornecedor: " + produto.getFornecedor().getNome())
//		);

		Scanner leitura = new Scanner(System.in);
		//1
//		System.out.println("Nome do produto: ");
//		String nomeProduto = leitura.nextLine();
//		List<Produto> produtos = produtoRepository.findByNome(nomeProduto);
//		produtos.forEach(System.out::println);

		//2
//		System.out.println("Qual categoria: ");
//		String categoria = leitura.nextLine();
//		List<Produto> lista = produtoRepository.findByCategoriaNome(categoria);
//		System.out.println(lista);

		//3
//		System.out.println("Preco: ");
//		Double preco = leitura.nextDouble();
//		List<Produto> produtos = produtoRepository.findByPrecoGreaterThan(preco);
//		produtos.forEach(System.out::println);

		//4
//		System.out.println("Preco: ");
//		Double preco = leitura.nextDouble();
//		List<Produto> produtos = produtoRepository.findByPrecoLessThan(preco);
//		produtos.forEach(System.out::println);

		//5
//		System.out.println("Nome do produto: ");
//		String nomeProduto = leitura.nextLine();
//		List<Produto> produtos = produtoRepository.findByNomeContaining(nomeProduto);
//		produtos.forEach(System.out::println);

		//6 -  Retorne pedidos que ainda não possuem uma data de entrega.
//		Pedido pedido3 = new Pedido(3L, null);
//		pedidoRepository.save(pedido3);
//		List<Pedido> pedidos = pedidoRepository.findByDataIsNull();
//		System.out.println(pedidos);

		//7
//		List<Pedido> pedidos = pedidoRepository.findByDataIsNotNull();
//		System.out.println(pedidos);

		//8
		System.out.println("Nome categoria: ");
		String categoria = leitura.nextLine();
		List<Produto> produtos = produtoRepository.findByCategoriaNomeOrderByPrecoAsc(categoria);
		System.out.println(produtos);



	}




}