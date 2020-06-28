package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import utils.Utilitarios;

public class Map {

	public static void main(String[] args) {
		
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		System.out.println("\n\nUsando Composicao....");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios.grito)
			.map(Utilitarios::status)
				.forEach(print);

	}

}
