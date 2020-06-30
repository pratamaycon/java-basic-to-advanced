package app.aggregation.application;

import app.aggregation.entities.*;


/**
 * testeAgregation
 */
public class testeAgregation {

    public static void main(String[] args) {
        Motorista motorista = new Motorista("Renato", 1234567);
        AutomovelAgregation gol = new AutomovelAgregation("Gol 1.0", 1000, motorista);
        System.out.println(gol);
    }
}