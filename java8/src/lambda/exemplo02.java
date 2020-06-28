package lambda;

import java.util.Arrays;
import java.util.List;

public class exemplo02 {
	public static void main(String[] args) {
		
		// Lista
		List<Integer> notas = Arrays.asList(7,6,5,8,10);
		
		// Lambda
		notas.forEach(n -> System.out.println(n));
		
		
		// Lambda com conficionais
		notas.forEach(n -> {
			if (n >= 7) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		});
	}
}
