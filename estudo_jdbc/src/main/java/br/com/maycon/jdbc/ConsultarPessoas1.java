package br.com.maycon.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.maycon.models.Pessoa;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";

		Statement stmt = conexao.prepareStatement(sql);
		ResultSet resultado =  stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		while (resultado.next()) {
			long codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getCodigo() + " ==> " + pessoa.getNome());
		}
		
		stmt.close();
		conexao.close();	

	}

}
