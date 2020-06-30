package br.com.maycon.estudoJpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maycon.estudoJpa.modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exericios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 4L);
		// objeto estado nao gerenciado
		em.detach(usuario);
		usuario.setNome("Maycon Prata");

		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
