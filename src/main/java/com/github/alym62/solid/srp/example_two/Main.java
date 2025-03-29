package com.github.alym62.solid.srp.example_two;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto Employee
        Employee emp = new Employee();
        emp.setName("Alyasaf Meireles");
        emp.setEmail("@alydev");
        emp.setHoursWorked(40);
        emp.setHourlyRate(30.0);
        emp.setMetSalesTarget(true);

        // Instanciar as classes de utilidade
        PayCalculator payCalculator = new PayCalculator();
        HourReporter hourReporter = new HourReporter();
        EmployeeSaver employeeSaver = new EmployeeSaver();

        // Calcular e imprimir o salário
        double salary = payCalculator.calculatePay(emp);
        System.out.println("Salary: $" + salary);

        // Gerar e imprimir o relatório de horas
        String report = hourReporter.reportHours(emp);
        System.out.println(report);

        // Salvar as informações do empregado
        employeeSaver.save(emp);
        System.out.println("Employee saved successfully.");
    }
}
