package br.com.maycon.treinamentojpa.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import br.com.maycon.treinamentojpa.controller.ProdutoController;
import br.com.maycon.treinamentojpa.model.Produto;

public class SelecaoProdutosAtualizacao {

	public static void viewSelecaoProdutosAtualizacao() {
		final JFrame selecaoAlunos = new JFrame("Selecao alunos");
		selecaoAlunos.setSize(300, 200);
		// para centralizar
		selecaoAlunos.setLocationRelativeTo(null);
		selecaoAlunos.setLayout(null);
		selecaoAlunos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// bloquear maximizar tela
		selecaoAlunos.setResizable(false);

		// JCombox
		final JComboBox<Produto> combo = new JComboBox<Produto>();
		
		ProdutoController alunoController = new ProdutoController();
		List<Produto> produtos = alunoController.selecionarTodos();

		// definindo posição do combo
		combo.setBounds(20, 20, 200, 20);

		// Evento
		combo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String str = combo.getSelectedItem().toString();
				String strCodigo = str.substring(str.length() - 1);
				Long codigo = Long.parseLong(strCodigo);
				selecaoAlunos.setVisible(false);
				new AlteracaoProduto();
				AlteracaoProduto.viewAlteracaoProduto(codigo);

			}
		});
		combo.addItem(null);
		for (Produto produto: produtos) {
			combo.addItem(produto);
		}

		// Adicionar combo no formulário
		selecaoAlunos.add(combo);

		// Exibir formulário e seus componentes
		selecaoAlunos.setVisible(true);

	}
	
}
