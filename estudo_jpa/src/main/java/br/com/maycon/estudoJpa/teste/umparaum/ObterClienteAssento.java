package br.com.maycon.estudoJpa.teste.umparaum;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.umparaum.Assento;
import br.com.maycon.estudoJpa.modelo.umparaum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1L);
		System.out.println(cliente.getAssento().getNome());
		daoCliente.fechar();
		
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		
		Assento assento = daoAssento.obterPorID(4L);
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();

	}

}
