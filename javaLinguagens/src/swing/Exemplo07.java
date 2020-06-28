package swing;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Exemplo07 {

	public static void main(String[] args) {

		JFrame formulario = new JFrame("Formulário");
		formulario.setSize(500, 300);
		// para centralizar
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Vetores
		String [] colunas = new String[] {"Curso", "Valor"};
		Object[][] cursos = new Object[][] {
				{"Java", 1900},
				{"PHP", 1250},
				{"C#", 1890}
		};
		
		// JTable
		JTable jTable = new JTable(cursos, colunas);
		jTable.setBounds(25, 10, 450, 280);
		
		// Adicionar table no formulário
		formulario.add(jTable);

		// Exibir formulário e seus componentes
		formulario.setVisible(true);

	}

}
