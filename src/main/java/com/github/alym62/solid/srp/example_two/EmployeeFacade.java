package com.github.alym62.solid.srp.example_two;

public class EmployeeFacade {
    private final PayCalculator payCalculator;
    private final HourReporter hourReporter;
    private final EmployeeSaver employeeSaver;

    public EmployeeFacade(PayCalculator payCalculator, HourReporter hourReporter, EmployeeSaver employeeSaver) {
        this.payCalculator = payCalculator;
        this.hourReporter = hourReporter;
        this.employeeSaver = employeeSaver;
    }

    public double calculatePay(Employee emp) {
        return payCalculator.calculatePay(emp);
    }

    public void reportHours(Employee emp) {
        hourReporter.reportHours(emp);
    }

    public void saveEmployee(Employee emp) {
        employeeSaver.save(emp);
    }
}
