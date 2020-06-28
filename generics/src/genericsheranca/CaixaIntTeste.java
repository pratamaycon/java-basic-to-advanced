package genericsheranca;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guardar(1223);
		
		System.out.println(caixaA.abrir());

	}

}
