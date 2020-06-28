package br.com.maycon.application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.maycon.jdbc.DB;
import br.com.maycon.jdbc.exception.DBIntegrityException;

public class Program4 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DB.getConnection();
			pst = conn.prepareStatement(
					"delete from department "
					+ "where "
					+ "id = ?");
			
			pst.setInt(1, 2);

			int rowsAffected = pst.executeUpdate();

			System.out.println("Done! Rows Affected: " + rowsAffected);

		} catch (Exception e) {
			throw new DBIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}

	}

}
