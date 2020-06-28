package br.com.maycon.maven.hibernate.util;

import br.com.maycon.maven.hibernate.model.Cliente;
import br.com.maycon.maven.hibernate.repository.ClienteRepository;

public class Principal {
	
	public static void main(String[] args) {
		
		// Classe de persistencia
		ClienteRepository clienteRepository = new ClienteRepository();
		
		// Mock de dados do cliente
		Cliente cliente = new Cliente();
		cliente.setNome("Maycon");
		cliente.setIdade(24);
		
		// Excecutar método de cadastro
		clienteRepository.cadastrar(cliente);
		
		
	}
}
