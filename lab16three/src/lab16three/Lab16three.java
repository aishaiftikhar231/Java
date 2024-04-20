/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16three;

/**
 *
 * @author hp
 */
public class Lab16three {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         TeamLeader teamLeader = new TeamLeader("John Smith", "123-A", "2023-05-24", 1, 15.50, 500, 40, 30);
        
        System.out.println("Employee Name: " + teamLeader.getName());
        System.out.println("Employee Number: " + teamLeader.getEmployeeNumber());
        System.out.println("Hire Date: " + teamLeader.getHireDate());
        System.out.println("Shift: " + teamLeader.getShift());
        System.out.println("Hourly Pay Rate: $" + teamLeader.getHourlyPayRate());
        System.out.println("Monthly Bonus: $" + teamLeader.getMonthlyBonus());
        System.out.println("Required Training Hours: " + teamLeader.getRequiredTrainingHours());

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

class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}

class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;

    public TeamLeader(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate, double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours) {
        super(name, employeeNumber, hireDate, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours) {
        this.attendedTrainingHours = attendedTrainingHours;
    }
}

      