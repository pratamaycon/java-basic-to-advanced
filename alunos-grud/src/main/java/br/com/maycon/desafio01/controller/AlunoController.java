package br.com.maycon.desafio01.controller;

import java.util.List;

import br.com.maycon.desafio01.model.Aluno;
import br.com.maycon.desafio01.repository.AlunoRepository;

public class AlunoController {

	private Aluno alunoModel;
	private AlunoRepository alunoRepository = new AlunoRepository();

	public AlunoController() {}
	
	public AlunoController(Aluno alunoModel) {
		this.alunoModel = alunoModel;
	}
	
	public void cadastrar () {
		alunoRepository.cadastrar(this.alunoModel);
	}
	
	public List<Aluno> selecionarTodos() {
		return alunoRepository.selecionarTodos();
	}
	
	public Aluno selecionarAluno(Long codigo) {
		return alunoRepository.obterPorIdAluno(codigo);
	}
	
	public void atualizar(Aluno aluno) {
		alunoRepository.atualizar(aluno);
	}
	
	public void remover(Long codigo) {
		alunoRepository.remover(codigo);
	}
}
