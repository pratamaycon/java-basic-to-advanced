package br.com.maycon.treinamentojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.maycon.treinamentojpa.model.Produto;

public class TesteJPASingleResult {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SalaDeAula");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT c FROM Produto c WHERE c.nome = :nome");
		query.setParameter("nome", "Sony Playstation Ps3");

		Produto c = (Produto) query.getSingleResult();

		System.out.println(c.getNome());
		System.out.println(c.getEmpresa().getRazaoSocial());
		

	}

}
