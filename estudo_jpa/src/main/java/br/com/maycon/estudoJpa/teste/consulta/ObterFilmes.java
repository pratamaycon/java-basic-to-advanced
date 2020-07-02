package br.com.maycon.estudoJpa.teste.consulta;

import java.util.List;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.muitosparamuitos.Ator;
import br.com.maycon.estudoJpa.modelo.muitosparamuitos.Filme;

public class ObterFilmes {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = 
				dao.consultar("obterFilmesNotaMaiorQue", "nota", 8.5);
		
		for (Filme filme: filmes) {
			System.out.println(filme.getNome());
			
			for (Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
			
		}

	}

}
