package br.com.maycon.maven.hibernate.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maycon.maven.hibernate.model.*;

public class ClienteRepository {

	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager;

	public ClienteRepository() {
		entityManagerFactory = Persistence.createEntityManagerFactory("proway");
		entityManager = entityManagerFactory.createEntityManager();
	}

	// Cadastrar Clientes
	public void cadastrar(Cliente c) {
		entityManager.getTransaction().begin();
		entityManager.merge(c);
		entityManager.getTransaction().commit();
		entityManagerFactory.close();

	}

}
