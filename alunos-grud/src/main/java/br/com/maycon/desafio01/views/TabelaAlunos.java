package br.com.maycon.desafio01.views;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;

import br.com.maycon.desafio01.controller.AlunoController;
import br.com.maycon.desafio01.model.Aluno;

public class TabelaAlunos {

	public static void viewTabelaAlunos() {
		int i = 0;
		int j = 0;

		JFrame tabelaAlunos = new JFrame("Exibicao das notas");
		tabelaAlunos.setSize(500, 300);
		// para centralizar
		tabelaAlunos.setLocationRelativeTo(null);
		tabelaAlunos.setLayout(null);
		tabelaAlunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// bloquear maximizar tela
		tabelaAlunos.setResizable(false);

		AlunoController alunoController = new AlunoController();
		List<Aluno> alunos = alunoController.selecionarTodos();

		// Vetores
		String[] colunas = new String[] { "Nome", "M�dia" };
		Object[][] cursos = new Object[alunos.size()][2];

		for (i = 0; i < alunos.size(); i++) {
			for (j = 0; j < 2 - 1; j++) {
				cursos[i][j] = alunos.get(i).getNome();
			}
			cursos[i][j] = calcularMedia(
					alunos.get(i).getNota1(), 
					alunos.get(i).getNota2(), 
					alunos.get(i).getNota3());
		}

		// JTable
		JTable jTable = new JTable(cursos, colunas);
		jTable.setBounds(25, 10, 450, 280);

		// Adicionar table no formulário
		tabelaAlunos.add(jTable);

		// Exibir formulário e seus componentes
		tabelaAlunos.setVisible(true);
	}

	public static Double calcularMedia(Double n1, Double n2, Double n3) {
		Double media = (n1 + n2 + n3) / 3;
		return media;

	}

}
