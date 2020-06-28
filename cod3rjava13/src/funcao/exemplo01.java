package funcao;

import java.util.function.Function;

public class exemplo01 {

	public static void main(String[] args) {
		
		// Composicao de funcoes
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		
		Function<String, String> oResultadoE =
				valor -> "O Resultado é: " + valor;
		
		Function<String, String> empolgado =
				valor -> valor + "!!!";
		
		Function<String, String> duvida =
				valor -> valor + "???";
				
		String resultadoFinal1 = 
				parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = 
				parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33);
		
		System.out.println(resultadoFinal2);
		
		System.out.println(parOuImpar.apply(32));

	}

}
