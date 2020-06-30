package app.polyformism.entities;

/**
 * GeradorRelatorio
 */
public class GeradorRelatorio {

    public void adiciona(EmpregadoFaculdade empregado){
        System.out.println(empregado.getInfo());
        System.out.println(empregado.getGastos());
    }
}