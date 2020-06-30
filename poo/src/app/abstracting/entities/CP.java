package app.abstracting.entities;

public class CP extends ContaBancaria
{
	
	private Double limite;
	
	
	public Double getLimite(){
		return limite;
	}

	public void setNumero(double limite){
		this.limite = limite;
	}
	@Override
	public void depositar(double valor)
	{
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor)
	{
		if (this.saldo < valor){
			this.saldo -= valor + limite;
		}
	}
}
