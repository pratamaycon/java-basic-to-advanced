package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exemplo01 {
	public static void main(String[] args) {
		
		
		// instanciar um obj da classe Jframe
		JFrame form = new JFrame("Jframe");
		/**
		 * tem duas maneiras de setar um titulo pelo constructor ou 
		 * pelo form.setTitle('title');
		 */
		// setLayout precisa passar null para evitar sobreposição
		form.setLayout(null);
		// largura e comprimento
		form.setSize(500, 300);
		// finalizar o programa ao fechar a janela do progrma
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Rótulo
		JLabel rotulo = new JLabel("Nome");
		rotulo.setBounds(30, 30, 100, 16);
		
		// Campo de Texto
		JTextField campo = new JTextField();
		campo.setBounds(80, 30, 200, 20);
		
		// Botão
		JButton botao = new JButton("Executar");
		botao.setBounds(80, 60, 100, 20);
		
		// Ação no botão
		botao.addActionListener(new ActionListener(	) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obter o valor do campo 
				
				String texto = campo.getText();
				
				// Exibir o texto no console
				System.out.println(texto);
				
			}
		});
		
		
		// Adicionar elementos ao formulario
		form.add(rotulo);
		form.add(campo);
		form.add(botao);
		
		// exibindo o formulario e seus componentes
		form.setVisible(true);
	}
}
