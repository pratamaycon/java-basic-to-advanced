package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import models.Produto;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 2000.00, 0);
		Produto p2 = new Produto("TV", 1200.00, 50);
		Produto p3 = new Produto("Nintendo Switch", 4000.00, 2);
		Produto p4 = new Produto("Radio", 200.00, 0);
		Produto p5 = new Produto("Smartfone", 1000.00, 100);
		Produto p6 = new Produto("Fone de Ouvido", 20.00, 1000);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		// Funcoes
		Predicate<Produto> checarEstoque = p -> p.quantidade >= 1;
		Predicate<Produto> escolherProduto = p -> p.nome == "Nintendo Switch";
		
		Function<Produto, String> exbirProduto = p -> 
			"Nome do Produto: " + p.nome + "\nPreço: " + p.preco;
		
		// stream
		produtos.stream()
			.filter(checarEstoque)
			.filter(escolherProduto)
			.map(exbirProduto)
			.forEach(System.out::println);
		
	}
}
