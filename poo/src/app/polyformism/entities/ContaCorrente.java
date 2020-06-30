package app.polyformism.entities;

/**
 * ContaCorrente
 */
public class ContaCorrente extends Conta {

    @Override
    public void atualiza(double taxa){
       this.saldo += saldo * taxa * 2;
    }

    @Override
    public void deposita(double valor){
        this.saldo += valor - 0.10;
    }
}
