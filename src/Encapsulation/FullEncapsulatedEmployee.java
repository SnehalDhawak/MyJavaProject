package Encapsulation;

//Both getters and setters are provided.
public class FullEncapsulatedEmployee {
    private String name;
    private int salary;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter
    public int getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        FullEncapsulatedEmployee obj = new FullEncapsulatedEmployee();
        obj.setName("Snehal");
        obj.setSalary(50000);
            System.out.println("Name of emp:"+obj.getName());
            System.out.println("Salary of emp:"+obj.getSalary());
    }

}

