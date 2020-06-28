package utils;

import java.util.function.UnaryOperator;

public abstract class Utilitarios {

	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public final static UnaryOperator<String> grito = n -> n + "!!!";
	
	public final static String status(String status) { 
		return status + "*";
	}
	
}
