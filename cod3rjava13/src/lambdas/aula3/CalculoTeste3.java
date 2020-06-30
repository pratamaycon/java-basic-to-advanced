package lambdas.aula3;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 8));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 8));
		
		System.out.println(calc.legal());
		
		System.out.println(Calculo.muitoLegal());
	}

}
