package app.polyformism.entities;

/**
 * ContaPoupanca
 */
public class ContaPoupanca  extends Conta{
    
    @Override
    public void atualiza(double taxa){
       this.saldo += saldo * taxa * 3;
    }
}
