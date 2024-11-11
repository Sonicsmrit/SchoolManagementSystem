package models;

public class Teachers extends People{
    public String name;
    public int salary;
    public String department;

    public Teachers(int IDs, int age, String address, String name, int salary, String department) {
        super(IDs, age, address);
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
