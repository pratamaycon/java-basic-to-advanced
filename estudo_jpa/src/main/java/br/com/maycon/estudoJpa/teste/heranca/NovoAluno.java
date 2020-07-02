package br.com.maycon.estudoJpa.teste.heranca;

import br.com.maycon.estudoJpa.infra.DAO;
import br.com.maycon.estudoJpa.modelo.heranca.Aluno;
import br.com.maycon.estudoJpa.modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
			DAO<Aluno> alunoDAO = new DAO<>();
			
			Aluno aluno = new Aluno(123L, "João");
			AlunoBolsista alunoBolsista = new AlunoBolsista(345L, "Maria", 1000.00);
			
			alunoDAO.incluirAtomico(aluno);
			alunoDAO.incluirAtomico(alunoBolsista);
			
			alunoDAO.fechar();

	}

}
