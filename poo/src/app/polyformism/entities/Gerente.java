
package app.polyformism.entities;

import app.encapsulation.entities.Funcionario;

/**
 * Gerente
 */
public class Gerente extends Funcionario  {

    private Integer senha;
    private Integer numeroDeFuncGerenciados;

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Integer getNumeroDeFuncGerenciados() {
        return numeroDeFuncGerenciados;
    }

    public void setNumeroDeFuncGerenciados(int numeroDeFuncGerenciados) {
        this.numeroDeFuncGerenciados = numeroDeFuncGerenciados;
    }

    @Override
    public Double getBonificao(){
        return super.getBonificao() + 1000;
    }

}