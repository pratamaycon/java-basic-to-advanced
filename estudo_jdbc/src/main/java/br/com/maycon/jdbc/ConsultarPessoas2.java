package br.com.maycon.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um filtro: ");
		String filtro = sc.next();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		PreparedStatement pstmt = conexao.prepareStatement(sql);
		pstmt.setString(1, '%' + filtro + '%');
		
		ResultSet resultado = pstmt.executeQuery();
		
		List<String> pessoas = new ArrayList<String>();
		while (resultado.next()) {
			String nome = resultado.getString("nome");
			pessoas.add(nome);
		}
		
		for (String nome: pessoas) {
			System.out.println(nome);
		}
		
		pstmt.close();
		conexao.close();
		sc.close();

	}

}
