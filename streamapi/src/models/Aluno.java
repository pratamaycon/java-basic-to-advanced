package models;

public class Aluno {

	public final String nome;
	public final Double nota;
	public Boolean bomComportamento;
	
	public Aluno(String nome, Double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, Double nota, Boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " tem nota " + nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bomComportamento == null) ? 0 : bomComportamento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (bomComportamento == null) {
			if (other.bomComportamento != null)
				return false;
		} else if (!bomComportamento.equals(other.bomComportamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		return true;
	}
}
