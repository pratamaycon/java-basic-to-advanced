package app.abstracting.entities;

public class CC extends ContaBancaria
{

	private Double taxaOperacao;
	
	public Double getTaxaOperacao(){
		return taxaOperacao;
	}

	public void setNumero(double taxaOperacao){
		this.taxaOperacao = taxaOperacao;
	}
	@Override
	public void depositar(double valor)
	{
		this.saldo += valor - taxaOperacao;
	}

	@Override
	public void sacar(double valor)
	{
		this.saldo -= valor - taxaOperacao;
	}
	
}
