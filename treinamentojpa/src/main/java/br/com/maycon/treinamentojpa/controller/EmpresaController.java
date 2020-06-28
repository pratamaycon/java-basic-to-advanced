package br.com.maycon.treinamentojpa.controller;

import br.com.maycon.treinamentojpa.model.Empresa;
import br.com.maycon.treinamentojpa.repository.EmpresaRepository;

public class EmpresaController {

	private Empresa empresaModel;
	private EmpresaRepository empresaRepository = new EmpresaRepository();

	public EmpresaController() {}

	public EmpresaController(Empresa empresaModel) {
		this.empresaModel = empresaModel;
	}

	public void cadastrar() {
		this.empresaRepository.cadastrar(this.empresaModel);
	}

}
