package abstracao;

public class Principal {

	public static void main(String[] args) {
		
		PessoaJuridica pj = new PessoaJuridica("GOVBR", "1000000000");
		System.out.println(pj);
		pj.contratarFuncionario();
		
		PessoaFisica pf = new PessoaFisica("Maycon", "32233223233");
		System.out.println(pf);
		pf.comer();
		pf.respirar();
		pf.andar();
		pf.dormir();
		
	}

}
