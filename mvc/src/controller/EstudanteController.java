package controller;

import model.Estudante;
import view.EstudanteView;

public class EstudanteController {
	
	private Estudante estudanteModel;
	private EstudanteView estudanteView;
	
	public EstudanteController(Estudante estudanteModel, EstudanteView estudanteView ) {
		this.estudanteModel = estudanteModel;
		this.estudanteView = estudanteView;
	}
	
	public String getNome() {
		return getNome();
	}

	public void setNome(String nome) {
		this.estudanteModel.setNome(nome);
	}

	public int getSerie() {
		return getSerie();
	}

	public void setSerie(int serie) {
		this.estudanteModel.setSerie(serie);
	}
	
	// Atualizar
	public void atualizar() {
		estudanteView.exibirDados(estudanteModel.getNome(), estudanteModel.getSerie());
	}

}
