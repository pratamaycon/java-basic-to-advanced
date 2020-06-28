package br.com.maycon.application;

import java.util.List;

import br.com.maycon.model.dao.DaoFactory;
import br.com.maycon.model.dao.DepartmentDao;
import br.com.maycon.model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ======");
		Department newDepartment = new Department(null, "Roupas");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted: New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 2: department update ======");
		Department department = departmentDao.findById(7);
		department.setName("Roupas Femininas");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 3: department delete ======");
		departmentDao.deleteById(12);
		System.out.println("Delete completed!");
		
		System.out.println("\n=== TEST 4: department findAll ======");
		List<Department> sellersAll = departmentDao.findAll();
		sellersAll.forEach(System.out::println);

	}

}
