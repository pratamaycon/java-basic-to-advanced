package desafio01;


import java.util.function.Function;
import java.util.function.UnaryOperator;

import models.Produto;

public class Desafio {

	public static void main(String[] args) {
		
		
		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal =
			prod -> (prod.preco * (1 - prod.desconto));
			
		UnaryOperator<Double> impostoMunicipal = 
				imposto -> imposto >= 2500 ? imposto * 1.085 : imposto; 
		UnaryOperator<Double> calcFrete = 
				frete -> frete >= 3000.00 ? frete + 100 : frete + 50.00;
		
		Function<Double, String> arredondarCasaDecimais = 
						arredondar -> String.format("%.2f ", arredondar);
		
		Function<String, String> exibeCifras = 
						cifras -> ("R$"+cifras).replace(".", ",");
			
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(calcFrete)
				.andThen(arredondarCasaDecimais)
				.andThen(exibeCifras)
				.apply(produto);
		System.out.println("O preço final é " + preco);

	}

}
