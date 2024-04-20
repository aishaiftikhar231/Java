/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16two;

/**
 *
 * @author hp
 */
public class Lab16two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           ShiftSupervisor supervisor = new ShiftSupervisor("John Smith", "123-A", "2023-05-24", 50000, 2000);
        
        System.out.println("Employee Name: " + supervisor.getName());
        System.out.println("Employee Number: " + supervisor.getEmployeeNumber());
        System.out.println("Hire Date: " + supervisor.getHireDate());
        System.out.println("Annual Salary: $" + supervisor.getAnnualSalary());
        System.out.println("Annual Production Bonus: $" + supervisor.getAnnualProductionBonus());
    }
    
}
class Employee {
    private String name;
    private String employeeNumber;
    private String hireDate;

    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualProductionBonus;

    public ShiftSupervisor(String name, String employeeNumber, String hireDate, double annualSalary, double annualProductionBonus) {
        super(name, employeeNumber, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }
}


    


