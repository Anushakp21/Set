package map;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", ID=" + id +
                ", Department='" + department + '\'' +
                '}';
    }
}

public class EmployeeRecords {
    private Map<Integer, Employee> employeeMap;

    public EmployeeRecords() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        System.out.println("Employee added: " + employee.getName());
    }

    public Employee searchById(int id) {
        return employeeMap.get(id);
    }

    public void displayAllEmployees() {
        System.out.println("All Employee Records:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        EmployeeRecords records = new EmployeeRecords();

        records.addEmployee(new Employee("John Doe", 101, "HR"));
        records.addEmployee(new Employee("Jane Smith", 102, "Finance"));
       
        Employee found = records.searchById(102);
        if (found != null) {
            System.out.println("Employee found: " + found);
        } else {
            System.out.println("Employee not found.");
        }

        records.displayAllEmployees();
    }
}

