package lambda;

import java.util.Arrays;
import java.util.List;

public class exemplo04 {

	public static void main(String[] args) {
		
		// Lista de Clientes
		List<String> clientes = Arrays.asList("Alice", "Mayra", "Tatiana", "Ana", "Jaison");
		
		// Verificar nomes que comecem com a letra A
		clientes
			.stream()
			.filter((c) -> c.startsWith("A"))
			.forEach(System.out::println);
		

	}

}
