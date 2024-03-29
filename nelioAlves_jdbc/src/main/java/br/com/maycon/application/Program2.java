package br.com.maycon.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.maycon.jdbc.DB;

public class Program2 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			conn = DB.getConnection();

			pst = conn.prepareStatement("Insert into seller" + "(name, email, birthDate, baseSalary, department_id) "
					+ "values " + "(?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS);

			pst.setString(1, "Carl Purple");
			pst.setString(2, "carl@gmail.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			pst.setDouble(4, 3000.0);
			pst.setInt(5, 4);

			int rowsAffected = pst.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Done!!");
				ResultSet rs = pst.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			} else {
				System.out.println("No rown affected!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(pst);
			DB.closeConnection();
		}

	}

}
