package Encapsulation;
//Use a constructor to initialize values and still follow encapsulation.
public class Employee {
    private int empId;
    private String empName;

    // Constructor
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public static void main(String[] args) {
        Employee e = new Employee(101, "Priya");
        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getEmpName());
    }
}