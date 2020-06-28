package lambda;

import java.util.Arrays;
import java.util.List;

public class exemplo01 {

	public static void main(String[] args) {
		
		
		// Lista
		List<String> cores = Arrays.asList("Azul", "Verde", "Amarelo");
		
		/**
		 * Laço for tradicional
		 */
		for (int i = 0; i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
		
		// Lamdba
		cores.forEach(cor -> System.out.println(cor));
		
	}
}
