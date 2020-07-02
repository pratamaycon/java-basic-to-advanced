package br.com.maycon.estudoJpa.teste.umparamuitos;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.umparamuitos.ItemPedido;
import br.com.maycon.estudoJpa.modelo.umparamuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorID(1L);
		dao.fechar();
		
		for (ItemPedido item: pedido.getItemPedidos()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}

	}

}
