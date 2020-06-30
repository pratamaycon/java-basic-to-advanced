package lambdas.aula3;

/*
 *  A utiliza��o dessa implementa��o permite apenas uma assinatura 
 *  tradicional de interface
 */

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}