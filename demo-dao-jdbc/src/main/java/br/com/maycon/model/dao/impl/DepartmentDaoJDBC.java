package br.com.maycon.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.maycon.jdbc.DB;
import br.com.maycon.jdbc.exception.DBException;
import br.com.maycon.model.dao.DepartmentDao;
import br.com.maycon.model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn;

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department department) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("insert into department " + "(name) " + "values " + "(?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, department.getName());

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					department.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DBException("Unexpected error! No rows affected!");
			}

		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public void update(Department department) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("update department " + "Set name = ? " + "where id= ? ",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, department.getName());
			st.setInt(2, department.getId());

			st.executeUpdate();

		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("delete from department where id = ?");
			
			st.setInt(1, id);
			
			int rows = st.executeUpdate();
			
			if (rows == 0) { 
				throw new DBException("Id inexistent!");
			}
			
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT * " + 
					"from department " + 
					"Where department.id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			while (rs.next()) {
				Department dep = instantiateDepartment(rs);
				return dep;

			}
			return null;
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("id"));
		dep.setName(rs.getString("name"));

		return dep;
	}

	@Override
	public List<Department> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;		
		try {
			st = conn.prepareStatement(
					"SELECT * " + 
					"from department " + 
					"order by name");
			
			rs = st.executeQuery();
			
			List<Department> departments = new ArrayList<Department>();
			
			while (rs.next()) {
				Department dep = instantiateDepartment(rs);
				departments.add(dep);
				
			}
			return departments;
		} catch (SQLException e) {
			throw new DBException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
