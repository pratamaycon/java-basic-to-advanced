package lambdas.aula2;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicao();
		System.out.println(calculo.executar(2, 3));

	}

}
