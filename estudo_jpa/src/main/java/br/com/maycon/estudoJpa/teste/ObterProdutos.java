package br.com.maycon.estudoJpa.teste;

import java.util.List;

import br.com.maycon.estudoJpa.daos.ProdutoDAO;
import br.com.maycon.estudoJpa.modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + 
					", Nome: " + produto.getNome());
		}
		
		double precoTotal = 
				produtos.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (t, p) -> t + p)
					.doubleValue();
		System.out.println("O valor da total é R$ " + precoTotal);
		
		dao.fechar();

	}

}
