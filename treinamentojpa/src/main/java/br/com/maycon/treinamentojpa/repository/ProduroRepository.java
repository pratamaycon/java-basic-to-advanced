package br.com.maycon.treinamentojpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.maycon.treinamentojpa.model.Produto;

public class ProduroRepository {

	private EntityManagerFactory emf;
	private EntityManager em;

	public ProduroRepository() {
		emf = Persistence.createEntityManagerFactory("SalaDeAula");
		em = emf.createEntityManager();
	}

	// Cadastrar as pessoas
	public void cadastrar(Produto produto) {
		try {
			em.getTransaction().begin();
			em.merge(produto);
			em.getTransaction().commit();

			em.close();
			emf.close();
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao Salvar: " + e.getMessage());
		}
	}

	// Selecionar todos os Alunos
	public List<Produto> selecionarTodos() {
		try {
			String jpql = "select u from Produto u";
			TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);

			List<Produto> produtos = query.getResultList();

			em.close();
			emf.close();

			return produtos;
		} catch (Exception e) {
			System.out.println("Erro ao buscar Todos :" + e.getMessage());
		}
		return null;
	}
	
	// Buscar Aluno por Id
	public Produto obterPorIdProduto(Long codigo) {
		try {
			Produto produto = em.find(Produto.class, codigo);

			// entityManager.close();
			// entityManagerFactory.close();

			return produto;
		} catch (Exception e) {
			System.out.println("Erro ao buscar Id :" + e.getMessage());
		}
		return null;
	}
	
	// Atualizar Produto
	public void atualizar(Produto produto) {
			try {
				em.getTransaction().begin();

				em.merge(produto);

				em.getTransaction().commit();

				em.close();
				emf.close();
			} catch (Exception e) {
				em.getTransaction().rollback();
				System.out.println("Erro ao atualizar: " + e.getMessage());
			}
		}
}
