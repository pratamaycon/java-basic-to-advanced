package br.com.maycon.estudoJpa.teste.umparamuitos;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.basico.Produto;
import br.com.maycon.estudoJpa.modelo.umparamuitos.ItemPedido;
import br.com.maycon.estudoJpa.modelo.umparamuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		Produto produto = new Produto("Armario", 1500.00);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirTransacao()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharTransacao()
			.fechar();

	}

}
