package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplo02 {
	public static void main(String[] args) {
		
		JFrame formulario = new JFrame("Formulário");
		formulario.setSize(300, 200);
		// para centralizar
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JCombox
		JComboBox<String> combo = new JComboBox<String>();
		
		// definindo posição do combo
		combo.setBounds(20, 20, 200, 20);
		
		// Evento
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Popup
				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				
			}
		});
		combo.addItem(null);
		combo.addItem("Java Fundamentos");
		combo.addItem("Formação Java");
		combo.addItem("PHP");
		combo.addItem("C#");
		
		// Adicionar combo no formulário
		formulario.add(combo);
		
		// Exibir formulário e seus componentes
		formulario.setVisible(true);
	}
}
