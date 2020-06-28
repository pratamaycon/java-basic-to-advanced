package br.com.maycon.treinamentojpa.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInicialProduto {

	public static void viewTelaInicial() {

		// instanciar um obj da classe Jframe
		final JFrame menuOpcoes = new JFrame("Menu de Opções de GRUD");
		/**
		 * tem duas maneiras de setar um titulo pelo constructor ou pelo
		 * form.setTitle('title');
		 */
		// setLayout precisa passar null para evitar sobreposiÃ§Ã£o
		menuOpcoes.setLayout(null);
		// largura e comprimento
		menuOpcoes.setSize(500, 300);
		// finalizar o programa ao fechar a janela do progrma
		menuOpcoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// bloquear maximizar tela
		menuOpcoes.setResizable(false);

		// Rotulo de cadastro
		JLabel rotuloCadastro = new JLabel("Ir para tela de Cadastro de Produtos");
		rotuloCadastro.setBounds(150, 28, 220, 16);
		// Botao de cadastro
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(30, 26, 100, 20);

		// Rotulo de atualizar
		JLabel rotuloAtualizar = new JLabel("Ir para tela de Atualizacao de Produtos");
		rotuloAtualizar.setBounds(150, 58, 250, 16);
		// Botao de atualizar
		JButton botaoAtualizar = new JButton("Atualizar");
		botaoAtualizar.setBounds(30, 56, 100, 20);

		// Rotulo de exibir
		JLabel rotuloExbir = new JLabel("Ir para tela de exibicao dos Alunos");
		rotuloExbir.setBounds(150, 88, 250, 16);
		// Botao de exibir
		JButton botaoExibir = new JButton("Exibir");
		botaoExibir.setBounds(30, 86, 100, 20);

		// Rotulo de exibir
		JLabel rotuloExcluir = new JLabel("Ir para tela de exclusao de Alunos");
		rotuloExcluir.setBounds(150, 118, 250, 16);
		// Botao de exibir
		JButton botaoExcluir = new JButton("Excluir");
		botaoExcluir.setBounds(30, 116, 100, 20);

		// Acao no botao
		botaoCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				menuOpcoes.setVisible(false);
				new CadastroProduto();
				CadastroProduto.viewCadastroProduto();
			}
		});

		botaoAtualizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				menuOpcoes.setVisible(false);
				new SelecaoProdutosAtualizacao();
				SelecaoProdutosAtualizacao.viewSelecaoProdutosAtualizacao();
			}
		});

		botaoAtualizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				menuOpcoes.setVisible(false);

			}
		});

		botaoExcluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				menuOpcoes.setVisible(false);

			}
		});

		// Adicionar elementos ao formulario
		menuOpcoes.add(botaoCadastrar);
		menuOpcoes.add(rotuloCadastro);
		menuOpcoes.add(botaoAtualizar);
		menuOpcoes.add(rotuloAtualizar);
		menuOpcoes.add(botaoExibir);
		menuOpcoes.add(rotuloExbir);
		menuOpcoes.add(botaoExcluir);
		menuOpcoes.add(rotuloExcluir);

		// exibindo o formulario e seus componentes
		menuOpcoes.setVisible(true);

	}

}
