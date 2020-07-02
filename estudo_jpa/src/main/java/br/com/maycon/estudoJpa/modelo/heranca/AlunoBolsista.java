package br.com.maycon.estudoJpa.modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

	private Double volarBolsa;

	public AlunoBolsista() {

	}

	public AlunoBolsista(Long matricula, String nome, Double volarBolsa) {
		super(matricula, nome);
		this.volarBolsa = volarBolsa;
	}

	public Double getVolarBolsa() {
		return volarBolsa;
	}

	public void setVolarBolsa(Double volarBolsa) {
		this.volarBolsa = volarBolsa;
	}

}
