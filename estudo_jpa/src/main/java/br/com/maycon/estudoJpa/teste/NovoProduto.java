package br.com.maycon.estudoJpa.teste;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor 23", 789.98);
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("Id do produto: " + produto.getId());
		
		

	}

}
