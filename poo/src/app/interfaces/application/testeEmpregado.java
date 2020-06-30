package app.interfaces.application;

import app.interfaces.entities.*;

public class testeEmpregado
{
	
	public static void main(String[] args){
		
		Cliente c1 = new Cliente();
		c1.setNome("Maycon");
		c1.setEndereco("Rua Lauro Muller");
		c1.setIdade(23);
		c1.setSenha(123);
		c1.autentica(0);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Gustavo");
		gerente.setEndereco("Av. Roberto Silveira");
		gerente.setSalario(4000);
		gerente.setSenha(666);
		gerente.autentica(666);
		
		
		Diretor diretor =new Diretor();
		diretor.setNome("Daniel");
		diretor.setEndereco("Av. Ernani Amaral Peixoto");
		diretor.setSalario(6000);
		diretor.setSenha(999);
		diretor.autentica(999);
	}
}
