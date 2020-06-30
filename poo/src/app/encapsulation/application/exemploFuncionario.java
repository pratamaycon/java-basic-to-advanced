package app.encapsulation.application;

import java.util.ArrayList;
import java.util.List;

import app.encapsulation.entities.*;

public class exemploFuncionario
{
	
	public static void main(String[] args){

		Data chegadaMaycon = new Data(50, 2, 2019);
		
		Funcionario func1 = new Funcionario(1, "Maycon", chegadaMaycon);
		func1.setMatr(32);
		func1.setDepart("TI");
		func1.setSalario(1100);	
		
		System.out.println(func1);
		
		System.out.println("\n++++++++++++++++");

		Data chegadaLyssa = new Data(8, 8, 2019);
		
		Funcionario func2 = new Funcionario(2, "Lyssa", chegadaLyssa);
		
		func2.setMatr(33);
		func2.setDepart("RH");
		func2.setSalario(1400);
		
		System.out.println(func2);

		List<Funcionario> empregados = new ArrayList<>();

		empregados.add(func1);
		empregados.add(func2);
		
		for (Funcionario emps: empregados){
			Empresa emp = new Empresa(emps, 10);
			System.out.println(emp.getFuncionarios(1));
		}
	}
}
