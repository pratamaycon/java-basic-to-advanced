package app.polyformism.entities;

/**
 * EmpregadoFaculdade
 */
public class EmpregadoFaculdade {

    protected String nome;
    protected Double salario;
    
    public Double getGastos(){
        return salario;
    }

    public String getInfo() {
        return "nome: " + this.nome + ", com salario: " + this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}