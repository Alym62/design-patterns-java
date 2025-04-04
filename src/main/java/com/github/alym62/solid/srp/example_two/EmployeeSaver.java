package com.github.alym62.solid.srp.example_two;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeSaver {
    public void save(Employee emp) {
        if (isValid(emp)) {
            saveEmployeeTxt(emp);
        }
    }

    private static void saveEmployeeTxt(Employee emp) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(emp.getName() + ".txt"))) {
            writer.write("Name: " + emp.getName());
            writer.newLine();
            writer.write("Email: " + emp.getEmail());
            writer.newLine();
            writer.write("Hours Worked: " + emp.getHoursWorked());
            writer.newLine();
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    private boolean isValid(Employee emp) {
        return emp.getName() != null && !emp.getName().trim().isEmpty() &&
                emp.getEmail() != null && !emp.getEmail().trim().isEmpty();
    }
}
