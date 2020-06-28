package br.com.maycon.model.dao;

import br.com.maycon.jdbc.DB;
import br.com.maycon.model.dao.impl.DepartmentDaoJDBC;
import br.com.maycon.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
