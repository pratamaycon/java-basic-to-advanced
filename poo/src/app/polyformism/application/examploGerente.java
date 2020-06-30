package app.polyformism.application;

import app.encapsulation.entities.Funcionario;
import app.polyformism.entities.ControleBonficacoes;
import app.polyformism.entities.Gerente;

/**
 * examploGerente
 */
public class examploGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        System.out.println(gerente.getBonificao());

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++");

        ControleBonficacoes controle = new ControleBonficacoes();
        Funcionario func = new Funcionario();
        func.setSalario(1200);
        controle.registra(func);

        System.out.println("\n"+controle.getTotalBonficacoes());
    }
}