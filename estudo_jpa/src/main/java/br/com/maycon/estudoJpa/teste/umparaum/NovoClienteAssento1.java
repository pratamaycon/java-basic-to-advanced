package br.com.maycon.estudoJpa.teste.umparaum;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.umparaum.Assento;
import br.com.maycon.estudoJpa.modelo.umparaum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Carlos", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluir(assento)
			.incluir(cliente)
			.fecharTransacao()
			.fechar();
		
	}

}
