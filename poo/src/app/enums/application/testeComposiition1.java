package app.enums.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import app.enums.entities.*;
import app.enums.entities.enums.*;

/**
 * testeComposiition1
 */
public class testeComposiition1 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String departmentDesign = input.next();

        System.out.format("Enter department's name: %s", departmentDesign);
        System.out.println("\nEnter worker data:");
        String name = input.next();
        String level = input.next();
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentDesign));

        int quantityContracts = input.nextInt();
        System.out.format("How many contracts to this worker? ", quantityContracts );

        for (int i = 1; i <= quantityContracts; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(input.next());
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
        }


        System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = input.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        input.close();
    }
}