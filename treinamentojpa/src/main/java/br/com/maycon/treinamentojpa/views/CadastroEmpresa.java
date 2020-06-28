package br.com.maycon.treinamentojpa.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.maycon.treinamentojpa.controller.EmpresaController;
import br.com.maycon.treinamentojpa.model.Empresa;

public class CadastroEmpresa {

	public static void viewCadastroEmpresa() {

		// instanciar um obj da classe Jframe
		JFrame form = new JFrame("Cadastro de Empresas");
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
		JLabel rotuloNome = new JLabel("Raz�o Social: ");
		rotuloNome.setBounds(30, 30, 100, 16);
		// Campo de Texto
		final JTextField campo = new JTextField();
		campo.setBounds(120, 30, 200, 20);

		// Rotulo Nota 1
		JLabel rotuloNota1 = new JLabel("CNPJ: ");
		rotuloNota1.setBounds(30, 60, 200, 32);
		// Campo de Texto nota 1
		final JTextField campo1 = new JTextField();
		campo1.setBounds(80, 67, 200, 20);

		// Botao
		JButton botao = new JButton("Cadastro");
		botao.setBounds(80, 100, 100, 20);

		// Acao no botao
		botao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Obter o valor do campo
				String rs = campo.getText();
				// Exibir o texto no console
				System.out.println(rs);

				// Obter o valor do campo
				String cnpj = campo1.getText();
				// Exibir o texto no console
				System.out.println(cnpj);

				Empresa alunoModel = dados(rs, cnpj);

				EmpresaController empresaController = new EmpresaController(alunoModel);
				empresaController.cadastrar();

			}

			private Empresa dados(String rs, String razaoSocial) {
				Empresa empresaModel = new Empresa();
				empresaModel.setRazaoSocial(razaoSocial);
				empresaModel.setCnpj(rs);

				return empresaModel;
			}
		});

		// Adicionar elementos ao formulario
		form.add(rotuloNome);
		form.add(campo);
		form.add(rotuloNota1);
		form.add(campo1);
		form.add(botao);

		// exibindo o formulario e seus componentes
		form.setVisible(true);

	}

}
