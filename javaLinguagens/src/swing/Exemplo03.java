package swing;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Exemplo03 {
	public static void main(String[] args) {

		JFrame formulario = new JFrame("Formulário");
		formulario.setSize(300, 200);
		// para centralizar
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JCheckBox
		JCheckBox contrato = new JCheckBox("Aceito os termos");
		contrato.setBounds(20, 20, 150, 20);

		// Adicionar contrato no formulário
		formulario.add(contrato);

		// Exibir formulário e seus componentes
		formulario.setVisible(true);

	}
}
