package br.com.maycon.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.maycon.models.Pessoa;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Alterar o nome da pessoa: ");
		String nome = sc.nextLine();

		System.out.print("Id da Pessoa: ");
		long codigo = sc.nextLong();

		Connection conexao = FabricaConexao.getConexao();
		String sql = "update pessoas set nome = ? where codigo = ?";
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.setString(1, nome);
		pstmt.setLong(2, codigo);

		int sucess = pstmt.executeUpdate();
		if (sucess > 0) {
			System.out.println("Pessoa Alterada com Sucesso!!");
		} else {
			System.out.println("Ocorreu um erro!!!!!!!!!!!!!");
		}
		
		sql = "SELECT * FROM pessoas";
		Statement stmt = conexao.prepareStatement(sql);
		ResultSet resultado =  stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		while (resultado.next()) {
			long Varcodigo = resultado.getInt("codigo");
			String Varnome = resultado.getString("nome");
			pessoas.add(new Pessoa(Varcodigo, Varnome));
		}
		
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}

		sc.close();
		pstmt.close();
		conexao.close();

	}

}
