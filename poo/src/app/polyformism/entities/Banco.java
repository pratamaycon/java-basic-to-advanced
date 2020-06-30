package app.polyformism.entities;

import java.util.*;

/**
 * Banco
 */
public class Banco {

    private List<Conta> contasCriadas = new ArrayList<>();

    public void adiciona(Conta conta){
        contasCriadas.add(conta);
    }

    public Conta pegaConta(int posicao){
       return contasCriadas.get(posicao);
    }

    public Integer pegaTotalDeContas(){
        return contasCriadas.size();
    }

    

}