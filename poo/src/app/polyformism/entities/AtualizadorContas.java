

package app.polyformism.entities;

/**
 * AtualizadorContas
 */
public class AtualizadorContas {

    private Double saldoTotal = 0.0;
    private Double selic;

    public AtualizadorContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta conta){
        System.out.println(conta.getSaldo());
        conta.atualiza(selic);
        System.out.println(conta.getSaldo());
        this.saldoTotal += conta.getSaldo();
    }

    public Double getSaldoTotal() {
        return saldoTotal;
    }
}