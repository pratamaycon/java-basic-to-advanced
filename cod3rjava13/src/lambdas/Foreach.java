package lambdas;

import java.util.*;
import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Maycon", "Lyssa", "Vivi");

		System.out.println("Forma tradicional");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nLambda #01 ...");

		aprovados.forEach((nome) -> {
			System.out.println(nome + "!!!");
		});

		System.out.println("\nMethod Reference...");

		aprovados.forEach(System.out::println);

		System.out.println("\nLambda #02 ...");

		aprovados.forEach((nome) -> meuImprime(nome));
		
		System.out.println("\nMethod Reference 2...");

		aprovados.forEach(Foreach::meuImprime);

	}

	static void meuImprime(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}

}
