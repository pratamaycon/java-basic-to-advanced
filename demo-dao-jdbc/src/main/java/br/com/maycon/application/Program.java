package br.com.maycon.application;

import java.util.Date;
import java.util.List;

import br.com.maycon.model.dao.DaoFactory;
import br.com.maycon.model.dao.SellerDao;
import br.com.maycon.model.entities.Department;
import br.com.maycon.model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ======");
		Department department = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		sellers.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findAll ======");
		List<Seller> sellersAll = sellerDao.findAll();
		sellersAll.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: seller insert ======");
		Seller newSeller = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted: New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update ======");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		seller.setEmail("martha_waine@email.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6: seller delete ======");
		sellerDao.deleteById(20);
		System.out.println("Delete completed!");

	}

}
