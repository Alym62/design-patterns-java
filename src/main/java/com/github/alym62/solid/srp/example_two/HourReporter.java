package com.github.alym62.solid.srp.example_two;

public class HourReporter {
    public String reportHours(Employee emp) {
        double hours = emp.getHoursWorked();
        return "Employee: " + emp.getName() + "\nHours Worked: " + hours + "\nStatus: " + (hours >= 40 ? "Full-time" : "Part-time");
    }
}
