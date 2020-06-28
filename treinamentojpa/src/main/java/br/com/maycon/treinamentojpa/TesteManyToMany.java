package br.com.maycon.treinamentojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maycon.treinamentojpa.model.Aluno;
import br.com.maycon.treinamentojpa.model.Sala;

public class TesteManyToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SalaDeAula");
		EntityManager em = emf.createEntityManager();
		
		Aluno aluno = em.find(Aluno.class, 2L);
		
		for (Sala s: aluno.getSalas()) {
			System.out.println(s.getDescricao());
		}
		
		em.close();
		emf.close();

	}

}
