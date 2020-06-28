package abstracao;

public class PessoaFisica extends Pessoa {

	private String cpf;

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Meu cpf é: ");
		sb.append(getCpf());
		return sb.toString();
	}

	public void andar() {
		System.out.println("Andando");
	}

	public void dormir() {
		System.out.println("Dormindo");
	}

	public void comer() {
		System.out.println("Comendo");
	}

	public void respirar() {
		System.out.println("Respirando");
	}

}
