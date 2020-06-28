package br.com.maycon.treinamentojpa.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.maycon.treinamentojpa.controller.ProdutoController;
import br.com.maycon.treinamentojpa.model.Produto;

public class AlteracaoProduto {

	public static void viewAlteracaoProduto(final Long codigo) {

		// instanciar um obj da classe Jframe
		JFrame form = new JFrame("Alteracao de Produtos");
		/**
		 * tem duas maneiras de setar um titulo pelo constructor ou pelo
		 * form.setTitle('title');
		 */
		// setLayout precisa passar null para evitar sobreposiÃ§Ã£o
		form.setLayout(null);
		// largura e comprimento
		form.setSize(500, 300);
		// finalizar o programa ao fechar a janela do progrma
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// bloquear maximizar tela
		form.setResizable(false);

		ProdutoController produtoController = new ProdutoController();
		Produto produto = produtoController.selecionarAluno(codigo);

		// Rotulo Nome
		JLabel rotuloNome = new JLabel("Nome: ");
		rotuloNome.setBounds(30, 30, 100, 16);
		// Campo de Texto
		final JTextField campo = new JTextField();
		campo.setBounds(80, 30, 200, 20);
		campo.setText(produto.getNome());

		// Rotulo descricao
		JLabel rotuloNota1 = new JLabel("Descrição: ");
		rotuloNota1.setBounds(30, 60, 200, 32);
		// Campo de Texto descriao
		final JTextField campo1 = new JTextField();
		campo1.setBounds(100, 67, 200, 20);
		campo1.setText(produto.getDescricao());

		// Rotulo preco
		JLabel rotuloNota2 = new JLabel("Preço: ");
		rotuloNota2.setBounds(30, 90, 400, 32);
		// Campo de Texto preco
		final JTextField campo2 = new JTextField();
		campo2.setBounds(80, 97, 200, 20);
		campo2.setText(String.valueOf(produto.getPreco()));

		// Botao
		JButton botao = new JButton("Alteracao");
		botao.setBounds(80, 130, 100, 20);

		// Acao no botao
		botao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Obter o valor do campo
				String nome = campo.getText();
				// Exibir o texto no console
				System.out.println(nome);

				// Obter o valor do campo
				String descricao = campo1.getText();
				// Exibir o texto no console
				System.out.println(descricao);

				// Obter o valor do campo
				String srtPreco = campo2.getText();
				Double preco = Double.parseDouble(srtPreco);
				// Exibir o texto no console
				System.out.println(preco);

				Produto produtoModel = dados(nome, descricao, preco, codigo);

				ProdutoController produtoController = new ProdutoController(produtoModel);
				produtoController.atualizar(produtoModel);

			}
		});

		// Adicionar elementos ao formulario
		form.add(rotuloNome);
		form.add(campo);
		form.add(rotuloNota1);
		form.add(campo1);
		form.add(rotuloNota2);
		form.add(campo2);
		form.add(botao);

		// exibindo o formulario e seus componentes
		form.setVisible(true);

	}

	public static Produto dados(String nome, String descricao, Double preco, Long codigo) {

		Produto produtoModel = new Produto();
		produtoModel.setNome(nome);
		produtoModel.setDescricao(descricao);
		produtoModel.setPreco(preco);
		produtoModel.setId(codigo);

		return produtoModel;
	}

}
