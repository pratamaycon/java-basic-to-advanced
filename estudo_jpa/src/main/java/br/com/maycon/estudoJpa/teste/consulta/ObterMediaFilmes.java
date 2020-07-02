package br.com.maycon.estudoJpa.teste.consulta;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.consulta.NotaFilme;

public class ObterMediaFilmes {

	public static void main(String[] args) {

		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

		System.out.println(nota.getMedia());

		dao.fechar();

	}

}
