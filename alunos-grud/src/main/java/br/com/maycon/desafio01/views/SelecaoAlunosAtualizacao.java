package br.com.maycon.desafio01.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import br.com.maycon.desafio01.controller.AlunoController;
import br.com.maycon.desafio01.model.Aluno;

public class SelecaoAlunosAtualizacao {

	public static void viewSelecaoAlunosAtualizacao() {

		JFrame selecaoAlunos = new JFrame("Selecao alunos");
		selecaoAlunos.setSize(300, 200);
		// para centralizar
		selecaoAlunos.setLocationRelativeTo(null);
		selecaoAlunos.setLayout(null);
		selecaoAlunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// bloquear maximizar tela
		selecaoAlunos.setResizable(false);

		// JCombox
		JComboBox<Aluno> combo = new JComboBox<Aluno>();
		
		AlunoController alunoController = new AlunoController();
		List<Aluno> alunos = alunoController.selecionarTodos();

		// definindo posição do combo
		combo.setBounds(20, 20, 200, 20);

		// Evento
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String str = combo.getSelectedItem().toString();
				String strCodigo = str.substring(str.length() - 1);
				Long codigo = Long.parseLong(strCodigo);
				selecaoAlunos.setVisible(false);
				new FormularioAlteracao();
				FormularioAlteracao.viewAlteracao(codigo);

			}
		});
		combo.addItem(null);
		for (Aluno aluno: alunos) {
			combo.addItem(aluno);
		}

		// Adicionar combo no formulário
		selecaoAlunos.add(combo);

		// Exibir formulário e seus componentes
		selecaoAlunos.setVisible(true);

	}

}
