package utils;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public abstract class UtilsDesafio1 {

	public final static Function<Integer, String> converterBinario = n -> Integer.toBinaryString(n);
	
	public final static UnaryOperator<String> inverterBinary = n -> 
			new StringBuffer(n).reverse().toString();
			
	public final static Function<String, Integer> converterInteiro = n -> Integer.parseInt(n, 2);
	
}
