package app.polyformism.application;

import app.polyformism.entities.AtualizadorContas;
import app.polyformism.entities.Banco;
import app.polyformism.entities.ContaCorrente;
import app.polyformism.entities.ContaPoupanca;

/**
 * testaContas
 */
public class testaContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.deposita(1000);
        cp.deposita(1000);

        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println("Conta Corrente: "+ cc.getSaldo());
        System.out.println("Conta Poupança: " + cp.getSaldo());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        AtualizadorContas adc = new AtualizadorContas(0.01);

        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        Banco banco = new Banco();
        
        banco.adiciona(cc);
        banco.adiciona(cp);

    }
}
