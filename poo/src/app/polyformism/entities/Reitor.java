package app.polyformism.entities;

/**
 * Reitor
 */
public class Reitor extends EmpregadoFaculdade {

    public String getInfo(){
        return super.getInfo() + "\ne ele é um eleitor";
    }
    
}