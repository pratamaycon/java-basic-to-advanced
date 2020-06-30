package app.interfaces.entities;

import app.interfaces.interfaces.*;

public class Gerente extends Empregado implements Autenticavel
{
	
	private int senha;
	
	public Gerente(int senha){
		this.senha = senha;
	}
	
	public Gerente(){
		
	}

	@Override
	public Double vencimento()
	{
		return salario;
	}

	@Override
	public boolean autentica(int senha)
	{
		if (this.senha != senha) return false;
		
		System.out.println("Usuario Autenticado");

		return true;
	}
	
	public void setSenha(int senha) {
        this.senha = senha;
    }
	
}
