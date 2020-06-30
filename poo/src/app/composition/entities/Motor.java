package app.composition.entities;

/**
 * Motor
 */
public class Motor {

    private int potencia;

    public Motor(){
    }

    public Motor(int potencia){
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