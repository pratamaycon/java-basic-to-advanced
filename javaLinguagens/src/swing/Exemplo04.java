package swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exemplo04 {
	public static void main(String[] args) {

		JFrame formulario = new JFrame("Formulário");
		formulario.setSize(300, 200);
		// para centralizar
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JRadioButton 
		JRadioButton curso1 = new JRadioButton("Java");
		curso1.setBounds(10, 10, 100, 20);
		
		JRadioButton curso2 = new JRadioButton("C#");
		curso2.setBounds(120, 10, 100, 20);
		
		// ButtonGroup
		ButtonGroup cursos = new ButtonGroup();
		cursos.add(curso1);
		cursos.add(curso2);
		
		

		// Adicionar contrato no formulário
		formulario.add(curso1);
		formulario.add(curso2);

		// Exibir formulário e seus componentes
		formulario.setVisible(true);
	}
}
