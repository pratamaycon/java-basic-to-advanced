package consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import models.Produto;

public class exemplo01 {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto produto = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(produto);
		
		Produto produto2 = new Produto("Notebook", 2987.99, 0.25);
		Produto produto3 = new Produto("Caderno", 19.90, 0.03);
		Produto produto4 = new Produto("Borracha", 7.78, 0.18);
		Produto produto5 = new Produto("Lapis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(
				produto, produto2, produto3, produto4, produto5);
		
		produtos.forEach(imprimirNome);
		
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);

	}

}
