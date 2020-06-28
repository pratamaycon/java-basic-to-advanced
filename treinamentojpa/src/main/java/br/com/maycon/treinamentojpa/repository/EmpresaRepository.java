package br.com.maycon.treinamentojpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maycon.treinamentojpa.model.Empresa;

public class EmpresaRepository {

	private EntityManagerFactory emf;
	private EntityManager em;

	public EmpresaRepository() {
		emf = Persistence.createEntityManagerFactory("SalaDeAula");
		em = emf.createEntityManager();
	}

	// Cadastrar as pessoas
	public void cadastrar(Empresa empresa) {
		try {
			em.getTransaction().begin();
			em.merge(empresa);
			em.getTransaction().commit();

			em.close();
			emf.close();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao Salvar: " + e.getMessage());
		}
	}
	
}
