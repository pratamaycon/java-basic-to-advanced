package app.aggregation.entities;

/**
 * AutomovelAgregation
 */
public class AutomovelAgregation {

    private String modelo;
    private Motorista motorista;
    private MotorAgregation motor;

    public AutomovelAgregation(){}

    /*
	 * Método construtor passando como parâmetro uma String que indicará o
	 * modelo do Automovel e um int que indicará a potência do Motor que será
	 * instânciado dentro do deste método construtor.
	 */
    public AutomovelAgregation(String modelo, int potenciaMotor , Motorista motorista) {
        this(modelo, potenciaMotor);
        this.motorista = motorista;
    }

    /*
	 * Método construtor passando como parâmetro uma String que indicará o
	 * modelo do Automovel e um int que indicará a potência do Motor que será
	 * instânciado dentro do deste método construtor.
	 */
	public AutomovelAgregation(String modelo, int potenciaMotor) {
		this.modelo = modelo;
		/*
		 * Um objeto do tipo Motor sendo instânciado dentro do método construtor
		 * da classe Automovel sendo assim será gerada uma associção do tipo
		 * composição, pois o objeto Motor existirá somente enquanto o objeto
		 * Automovel existir.
		 */
		this.motor = new MotorAgregation(potenciaMotor);
	}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public MotorAgregation getMotor() {
        return motor;
    }

    public void setMotor(MotorAgregation motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Automovel: " + modelo + "\nMotor: " + motor + "\nMotorista: " + motorista;
    }

}