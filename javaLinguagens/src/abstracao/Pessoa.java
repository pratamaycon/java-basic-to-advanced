package abstracao;

public abstract class Pessoa {

	protected String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meu nome é: ");
		sb.append(getNome());
		sb.append("\n");
		return sb.toString();
	}
}
