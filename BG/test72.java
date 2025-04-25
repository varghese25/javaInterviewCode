class Employee {
    private int salary = 5000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
    }
}

public class test72 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(-1000);
        System.out.println(emp.getSalary());
    }

}

/*
 * The salary field is private and initialized to 5000.
 * 
 * The setSalary method only updates the salary if the input is greater than 0.
 * 
 * Since -1000 is not greater than 0, the condition fails, and salary remains
 * unchanged.
 * 
 * So, getSalary() returns the original value: 5000.
 */