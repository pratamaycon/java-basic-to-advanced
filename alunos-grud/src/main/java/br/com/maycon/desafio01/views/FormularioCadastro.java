package br.com.maycon.desafio01.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.maycon.desafio01.controller.AlunoController;
import br.com.maycon.desafio01.model.Aluno;

public class FormularioCadastro {

	public static void viewCadastro() {

		// instanciar um obj da classe Jframe
		JFrame form = new JFrame("Cadastro de Notas");
		/**
		 * tem duas maneiras de setar um titulo pelo constructor ou pelo
		 * form.setTitle('title');
		 */
		// setLayout precisa passar null para evitar sobreposição
		form.setLayout(null);
		// largura e comprimento
		form.setSize(500, 300);
		// finalizar o programa ao fechar a janela do progrma
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// bloquear maximizar tela
		form.setResizable(false);

		// Rotulo Nome
		JLabel rotuloNome = new JLabel("Nome: ");
		rotuloNome.setBounds(30, 30, 100, 16);
		// Campo de Texto
		final JTextField campo = new JTextField();
		campo.setBounds(80, 30, 200, 20);

		// Rotulo Nota 1
		JLabel rotuloNota1 = new JLabel("Nota 1: ");
		rotuloNota1.setBounds(30, 60, 200, 32);
		// Campo de Texto nota 1
		final JTextField campo1 = new JTextField();
		campo1.setBounds(80, 67, 200, 20);

		// Rotulo Nota 2
		JLabel rotuloNota2 = new JLabel("Nota 2: ");
		rotuloNota2.setBounds(30, 90, 400, 32);
		// Campo de Texto nota 1
		final JTextField campo2 = new JTextField();
		campo2.setBounds(80, 97, 200, 20);

		// Rotulo Nota 3
		JLabel rotuloNota3 = new JLabel("Nota 3: ");
		rotuloNota3.setBounds(30, 120, 600, 32);
		// Campo de Texto nota 1
		final JTextField campo3 = new JTextField();
		campo3.setBounds(80, 127, 200, 20);

		// Botao
		JButton botao = new JButton("Cadastro");
		botao.setBounds(80, 160, 100, 20);

		// Acao no botao
		botao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Obter o valor do campo
				String nome = campo.getText();
				// Exibir o texto no console
				System.out.println(nome);

				// Obter o valor do campo
				String srtNota1 = campo1.getText();
				Double nota1 = Double.parseDouble(srtNota1);
				// Exibir o texto no console
				System.out.println(nota1);

				// Obter o valor do campo
				String srtNota2 = campo2.getText();
				Double nota2 = Double.parseDouble(srtNota2);
				// Exibir o texto no console
				System.out.println(nota2);

				// Obter o valor do campo
				String srtNota3 = campo2.getText();
				Double nota3 = Double.parseDouble(srtNota3);
				// Exibir o texto no console
				System.out.println(nota3);

				Aluno alunoModel = dados(nome, nota1, nota2, nota3);

				AlunoController alunoController = new AlunoController(alunoModel);
				alunoController.cadastrar();

			}
		});

		// Adicionar elementos ao formulario
		form.add(rotuloNome);
		form.add(campo);
		form.add(rotuloNota1);
		form.add(campo1);
		form.add(rotuloNota2);
		form.add(campo2);
		form.add(rotuloNota3);
		form.add(campo3);
		form.add(botao);

		// exibindo o formulario e seus componentes
		form.setVisible(true);

	}

	public static Aluno dados(String nome, Double nota1, Double nota2, Double nota3) {

		Aluno alunoModel = new Aluno();
		alunoModel.setNome(nome);
		alunoModel.setNota1(nota1);
		alunoModel.setNota2(nota2);
		alunoModel.setNota3(nota3);

		return alunoModel;
	}
}
