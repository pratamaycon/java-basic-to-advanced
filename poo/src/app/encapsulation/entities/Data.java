package app.encapsulation.entities;

/**
 * Data
 */
public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data(){
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean dataValida(int dia, int mes, int ano) {
        if (dia > 31)
            return false;
        if (mes > 12)
            return false;
        if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30))
            return false;
        if (mes == 2) {
            if (bisessto(ano))
                if (dia > 29)
                    return false;
                else if (dia > 28)
                    return false;
        }
        return true;
    }

    public boolean bisessto(int ano) {
        return (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0));
    }

    @Override
    public String toString() {
        if (dataValida(dia, mes, ano)){
            return dia+"/"+mes+"/"+ano;
        }else{
            return "Data Errada";
        }
    }
}