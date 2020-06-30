package app.composition.entities;

/**
 * Automovel
 */
public class Automovel {

    private String modelo;
    private Motor motor;

    public Automovel(){
    }

    public Automovel(String modelo, int potenciaMotor) {
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Automovel: " + modelo + "\nMotor: " + motor;
    }
    
}