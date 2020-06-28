package br.com.maycon.desafio01.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.maycon.desafio01.model.Aluno;

public class AlunoRepository {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public AlunoRepository() {
		entityManagerFactory = Persistence.createEntityManagerFactory("proway");
		entityManager = entityManagerFactory.createEntityManager();
	}

	// Cadastrar os Alunos
	public void cadastrar(Aluno aluno) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(aluno);
			entityManager.getTransaction().commit();

			entityManager.close();
			entityManagerFactory.close();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Erro ao Salvar: " + e.getMessage());
		}
	}

	// Selecionar todos os Alunos
	public List<Aluno> selecionarTodos() {
		try {
			String jpql = "select u from Aluno u";
			TypedQuery<Aluno> query = entityManager.createQuery(jpql, Aluno.class);

			List<Aluno> alunos = query.getResultList();

			entityManager.close();
			entityManagerFactory.close();

			return alunos;
		} catch (Exception e) {
			System.out.println("Erro ao buscar Todos :" + e.getMessage());
		}
		return null;
	}

	// Buscar Aluno por Id
	public Aluno obterPorIdAluno(Long codigo) {
		try {
			Aluno aluno = entityManager.find(Aluno.class, codigo);

			// entityManager.close();
			// entityManagerFactory.close();

			return aluno;
		} catch (Exception e) {
			System.out.println("Erro ao buscar Id :" + e.getMessage());
		}
		return null;
	}

	// Atualizar Aluno
	public void atualizar(Aluno aluno) {
		try {
			entityManager.getTransaction().begin();

			entityManager.merge(aluno);

			entityManager.getTransaction().commit();

			entityManager.close();
			entityManagerFactory.close();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println("Erro ao atualizar: " + e.getMessage());
		}
	}

	// Remover Aluno
	public void remover(Long codigo) {
		try {

			Aluno aluno = entityManager.find(Aluno.class, codigo);

			if (aluno != null) {
				entityManager.getTransaction().begin();
				entityManager.remove(aluno);
				entityManager.getTransaction().commit();
			}

			entityManager.close();
			entityManagerFactory.close();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.out.println(" erro ao Salvar :" + e.getMessage());
		}
	}
}
