package app.polyformism.application;

import app.polyformism.entities.EmpregadoFaculdade;
import app.polyformism.entities.GeradorRelatorio;
import app.polyformism.entities.ProfessorFaculdade;
import app.polyformism.entities.Reitor;

/**
 * exemploEmpregado
 */
public class exemploEmpregado {

    public static void main(String[] args) {
        EmpregadoFaculdade emp = new EmpregadoFaculdade();
        emp.setNome("Andre");
        emp.setSalario(1200);
        System.out.println();

        GeradorRelatorio gerador = new GeradorRelatorio();
        gerador.adiciona(emp);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
    
        ProfessorFaculdade prof = new ProfessorFaculdade();
        prof.setNome("Victor");
        prof.setSalario(5000);
        prof.setHorasAula(20);   
        gerador.adiciona(prof);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        Reitor reitor = new Reitor();
        reitor.setNome("Carlos Andrade");
        reitor.setSalario(10000);
        gerador.adiciona(reitor);

    }
}