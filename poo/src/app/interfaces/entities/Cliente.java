package app.interfaces.entities;

import app.interfaces.interfaces.*;

public class Cliente extends Pessoa implements Autenticavel
{

	private int senha;
	
	@Override
	public boolean autentica(int senha)
	{
		if (this.senha != senha) return false;
		
		System.out.println("Usuario Autenticado");
		
		return true;
	}

	@Override
	public void setSenha(int senha)
	{
		this.senha = senha;
	}

}
