package br.com.maycon.jdbc;

import dao.DAO;

public class DAOteste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "Insert into pessoas (nome) values (?)";
		System.out.println(dao.incluir(sql, "Viviane"));
		System.out.println(dao.incluir(sql, "Lyssa"));
		System.out.println(dao.incluir(sql, "Lenita"));
		
		dao.close();

	}

}
