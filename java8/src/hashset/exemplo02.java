package hashset;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exemplo02 {
	
	public static void main(String[] args) {
		
		// Lista de n�meros
		List<Integer> numeros = Arrays.asList(2,4,6,8,10);
		
		// Realizar C�lculos
		List<Integer> listaNova = numeros
				.stream()
				.map(n -> n * 2)
				.collect(Collectors.toList());
		
		System.out.println(listaNova);
		
	}
	
}
