package listas;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Maycon");
		lista.add("Vivi");
		lista.add("Lyssa");
		lista.add("Lenita");
		lista.add("Teste");
		
		
		// Quantidade de registros 
		System.out.println("Existem : "+lista.size()+" registros da array");
		
		// Obter o segundo nome cadastrado
		System.out.println("O segundo nome é: "+lista.get(1));
		
		// Alterar lista
		lista.set(4, "Tatiane");
		
		// Remover um elemento
		lista.remove(0);
		
		// Remover todos os elementos
		lista.clear();
		
		// Exibir lista
		for (String l: lista) {
			System.out.println(l);
		}
	}
}
