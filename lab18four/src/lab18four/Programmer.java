/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18four;

/**
 *
 * @author hp
 */
public class Programmer extends Employee {
    private double baseSalary;
    private int overtimeHours;
    private double hourlyRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name);
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        double overtimePay = overtimeHours * hourlyRate;
        return baseSalary + overtimePay;
    }
    
}
