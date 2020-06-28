package swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exemplo05 {
	public static void main(String[] args) {

		JFrame formulario = new JFrame("Formulário");
		formulario.setSize(500, 300);
		// para centralizar
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Painel
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.BLACK);
		// Cor de fundo transparente default, aplicar setOpaque para true
		jPanel.setOpaque(true);
		jPanel.setBounds(0, 0, 250, 300);
		
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setBackground(Color.YELLOW);
		// Cor de fundo transparente default, aplicar setOpaque para true
		jPanel1.setOpaque(true);
		jPanel1.setBounds(150, 0, 1000, 300);
		
		// Adicionar painel no formulário
		formulario.add(jPanel);
		formulario.add(jPanel1);

		// Exibir formulário e seus componentes
		formulario.setVisible(true);

	}
}
