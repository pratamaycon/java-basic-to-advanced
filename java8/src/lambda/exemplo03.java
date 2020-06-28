package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exemplo03 {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(5,6,7,1,2,9,15, -5);
		
		Comparator<Integer> cmp = Collections.reverseOrder();
		
		// Ordem inversa
		Collections.sort(numeros, cmp);
		
		// Ordem normal
		Collections.sort(numeros);
		
		
		numeros.forEach(n -> System.out.println(n));
		
	}
	
}
