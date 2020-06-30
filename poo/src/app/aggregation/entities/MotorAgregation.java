package app.aggregation.entities;

/**
 * MotorAgregation
 */
public class MotorAgregation {

    private int potencia;

    public MotorAgregation(){}
    
    public MotorAgregation(int potencia){
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor: " + potencia;
    }
}