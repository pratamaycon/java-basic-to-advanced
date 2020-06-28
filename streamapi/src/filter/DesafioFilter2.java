package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		ModelProdutoDesafio p1 = new ModelProdutoDesafio("Notebook", 2000.00, 0.20, false);
		ModelProdutoDesafio p2 = new ModelProdutoDesafio("TV", 1200.00, 0.20, true);
		ModelProdutoDesafio p3 = new ModelProdutoDesafio("Nintendo Switch", 4000.00, 0.20, true);
		ModelProdutoDesafio p4 = new ModelProdutoDesafio("Radio", 500.00, 0.40, true );
		ModelProdutoDesafio p5 = new ModelProdutoDesafio("Smartfone", 1000.00, 0.40, true);
		ModelProdutoDesafio p6 = new ModelProdutoDesafio("Fone de Ouvido", 20.00, 0.50, true);
		ModelProdutoDesafio p7 = new ModelProdutoDesafio("Monitor HD", 800.00, 0.30, true);
		ModelProdutoDesafio p8 = new ModelProdutoDesafio("IPad", 2800.00, 0.30, true);
		
		List<ModelProdutoDesafio> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
		
		// Funcoes
		Predicate<ModelProdutoDesafio> desconto = p -> p.desconto >= 0.30;
		Predicate<ModelProdutoDesafio> freteGratis = p -> p.frete == true;
		Predicate<ModelProdutoDesafio> precoRelevante = p -> p.preco >= 500;
		
		Function<ModelProdutoDesafio, String> exbirProduto = p -> 
		"Aproveite! " + p.nome + " por R$ " + p.preco;
		
		
		// stream
		produtos.stream()
			.filter(desconto)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(exbirProduto)
			.forEach(System.out::println);

	}

}
