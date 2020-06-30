package br.com.maycon.estudoJpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maycon.estudoJpa.modelo.basico.Usuario;

public class ObterNovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("exericios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario usuario = em.find(Usuario.class, 4L);
		System.out.println(usuario.getNome());

		em.close();
		emf.close();

		

	}

}
