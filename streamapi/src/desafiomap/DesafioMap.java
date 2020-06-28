package desafiomap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import utils.UtilsDesafio1;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Integer> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		nums.stream()
			.map(UtilsDesafio1.converterBinario)
			.map(UtilsDesafio1.inverterBinary)
			.map(UtilsDesafio1.converterInteiro)
				.forEach(print);

	}

}
