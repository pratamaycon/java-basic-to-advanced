package app.encapsulation.entities;
import java.lang.reflect.*;
import javax.sql.*;
import java.util.*;

public class Empresa
{
	
	private String name; 
	private Funcionario[] empregados;
	
	public Empresa(Funcionario funcionario, int posicao){
		this.empregados = new Funcionario[posicao];
		for(int i = 0; i < empregados.length; i++){
			this.empregados[i] = funcionario;
		}
	}
	
	
	public Funcionario getFuncionarios(int posicao){
		return this.empregados[posicao];
	}
	
}
