package application;

import java.util.Arrays;
import java.util.List;

public class Program13 {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6);
		
		// Contador
		Integer sum = lista.stream().reduce(0, Integer::sum);
		System.out.println(sum);

	}

}
