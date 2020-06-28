package br.com.maycon.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o codigo: ");
		long codigo = sc.nextLong();

		Connection conexao = FabricaConexao.getConexao();
		String sql = "Delete from pessoas where codigo = ?";

		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.setLong(1, codigo);
		
		int result = pstmt.executeUpdate();
		if (result > 0) {
			System.out.println("Pessoa Excluida com sucesso");
		} else {
			System.out.println("Nada feito!");
		}

		sc.close();
		pstmt.close();
		conexao.close();

	}

}
