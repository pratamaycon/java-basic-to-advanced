package app.abstracting.entities;

public abstract class ContaBancaria
{
	protected Integer numero;
	protected Double saldo;
	
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	
	public Integer getNumero(){
		return numero;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public Double getSaldo(){
		return saldo;
	}
	
}
