package app.enums.entities;

import java.util.*;

import app.enums.entities.enums.*;

/**
 * Worker
 */
public class Worker extends Department {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    /** Associação com Deprtament 
     * um worker trabalha em um departamento */
    private Department department;
    /**  Associação com HourContract 
     *  um worker tem vários contracts 
    */
    private List<HourContract> contracts = new ArrayList<>();


    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c: contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_mouth = cal.get(Calendar.MONDAY);
            if (year == c_year && month == c_mouth){
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
}