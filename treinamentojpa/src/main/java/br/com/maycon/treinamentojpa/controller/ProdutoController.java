package br.com.maycon.treinamentojpa.controller;

import java.util.List;

import br.com.maycon.treinamentojpa.model.Produto;
import br.com.maycon.treinamentojpa.repository.ProduroRepository;

public class ProdutoController {

	private Produto produtoModel;
	private ProduroRepository empresaRepository = new ProduroRepository();

	public ProdutoController() {}

	public ProdutoController(Produto produtoModel) {
		this.produtoModel = produtoModel;
	}

	public void cadastrar() {
		empresaRepository.cadastrar(this.produtoModel);
	}
	
	public List<Produto> selecionarTodos() {
		return empresaRepository.selecionarTodos();
	}

	public Produto selecionarAluno(Long codigo) {
		return empresaRepository.obterPorIdProduto(codigo);
	}
	
	public void atualizar(Produto produto) {
		empresaRepository.atualizar(produto);
	}
	
}
