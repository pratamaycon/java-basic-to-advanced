package principal;

import controller.EstudanteController;
import model.Estudante;
import view.EstudanteView;

public class Principal {

	public static void main(String[] args) {
		
		Estudante estudanteModel = dados();
		EstudanteView estudanteView = new EstudanteView();
		EstudanteController estudanteController = new EstudanteController(estudanteModel, estudanteView);
	
		estudanteController.atualizar();
		
		estudanteController.setNome("Maycon");
		estudanteController.setSerie(4);
		
		estudanteController.atualizar();
	}

	// Metodos de Dados
	public static Estudante dados() {

		Estudante estudante = new Estudante();
		estudante.setNome("Raquel");
		estudante.setSerie(7);

		return estudante;

	}
}
