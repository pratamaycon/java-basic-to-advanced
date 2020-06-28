package swing;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Exemplo06 {
	public static void main(String[] args) {

		JFrame formulario = new JFrame("Formulário");
		formulario.setSize(500, 300);
		// para centralizar
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JTextArea
		JTextArea campo = new JTextArea();
		campo.setBounds(10, 10, 470, 150);
		
		// Adicionar campo no formulário
		formulario.add(campo);

		// Exibir formulário e seus componentes
		formulario.setVisible(true);

	}
}
