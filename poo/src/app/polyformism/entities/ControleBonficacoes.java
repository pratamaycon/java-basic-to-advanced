package app.polyformism.entities;

import app.encapsulation.entities.Funcionario;

/**
 * ControleBonficacoes
 */
public class ControleBonficacoes {

    private Double totalBonficacoes = 0.0;

    public void registra(Funcionario funcionario){
        this.totalBonficacoes += funcionario.getBonificao();
    }

    public Double getTotalBonficacoes() {
        return totalBonficacoes;
    }
    
}