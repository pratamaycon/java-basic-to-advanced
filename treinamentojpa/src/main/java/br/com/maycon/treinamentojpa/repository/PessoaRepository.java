package br.com.maycon.treinamentojpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maycon.treinamentojpa.model.Pessoa;

public class PessoaRepository {

	private EntityManagerFactory emf;
	private EntityManager em;

	public PessoaRepository() {
		emf = Persistence.createEntityManagerFactory("SalaDeAula");
		em = emf.createEntityManager();
	}

	// Cadastrar as pessoas
	public void cadastrar(Pessoa pessoa) {
		try {
			em.getTransaction().begin();
			em.merge(pessoa);
			em.getTransaction().commit();

			em.close();
			emf.close();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao Salvar: " + e.getMessage());
		}
	}
	
	// Remover Aluno
		public void remover(Long codigo) {
			try {

				Pessoa pessoa = em.find(Pessoa.class, codigo);

				if (pessoa != null) {
					em.getTransaction().begin();
					em.remove(pessoa);
					em.getTransaction().commit();
				}

				em.close();
				emf.close();
			} catch (Exception e) {
				em.getTransaction().rollback();
				System.out.println(" erro ao Salvar :" + e.getMessage());
			}
		}
}
