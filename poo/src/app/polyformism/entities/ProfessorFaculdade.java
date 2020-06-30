package app.polyformism.entities;

/**
 * ProfessorFaculdade
 */
public class ProfessorFaculdade extends EmpregadoFaculdade {

    private Integer horasAula;

    public Double getGastos(){
        return this.salario + this.horasAula * 10;
    }

    public String getInfo(){
        String infoBasica = super.getInfo();
        String info = infoBasica + "\nhoras de aula: "
        + this.horasAula; 

        return info;
    }

    public Integer getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

}