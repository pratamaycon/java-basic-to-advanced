package abstracao;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()); 
		sb.append("Meu cnpj é: ");
		sb.append(getCnpj());
		return sb.toString();
	}
	
	public void contratarFuncionario(){
		System.out.println("Contratou um funcionario");
	}
}
