package app.polyformism.entities;

/**
 * Conta
 */
public class Conta {

	protected double saldo;
	
	public Double getSaldo(){
		return saldo;
    }
    
    public void atualiza(double taxa){
        this.saldo += saldo * taxa; 
    }

    public void saca(double valor){
		this.saldo -= valor;
    }

    public void deposita(double valor){
		this.saldo += valor;
    }
}
