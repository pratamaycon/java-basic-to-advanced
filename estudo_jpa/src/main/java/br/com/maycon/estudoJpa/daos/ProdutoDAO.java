package br.com.maycon.estudoJpa.daos;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
	
	public ProdutoDAO() {
		super(Produto.class);
	}

}
