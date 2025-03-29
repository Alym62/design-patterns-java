package com.github.alym62.solid.srp.example_two;

public class PayCalculator {
    public double calculatePay(Employee emp) {
        double basePay = emp.getHoursWorked() * emp.getHourlyRate();
        return basePay + calculateBonus(emp);
    }

    private double calculateBonus(Employee emp) {
        if (emp.hasMetSalesTarget()) {
            return 100.0;
        }
        return 0.0;
    }
}
