package app.interfaces.entities;

public abstract class Empregado extends Pessoa
{
	protected Double salario;
	
	public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
	public abstract Double vencimento();
	
}
