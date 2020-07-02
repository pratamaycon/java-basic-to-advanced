package br.com.maycon.estudoJpa.teste.muitospramuitos;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.muitosparamuitos.Ator;
import br.com.maycon.estudoJpa.modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {

		Filme filmeA = new Filme("Star Wars Ep. 4", 8.9);
		Filme filmeB = new Filme("O fugitivo", 8.1);

		Ator atorA = new Ator("Harrison Ford");
		Ator atrizB = new Ator("Carrie Fischer");

		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);

		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);
		
	}

}
