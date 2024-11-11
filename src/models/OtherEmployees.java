package models;

public class OtherEmployees extends People {
    public String name;
    public int salary;
    public String Work;

    public OtherEmployees(int IDs, int age, String address, String name, int salary, String work) {
        super(IDs, age, address);
        this.name = name;
        this.salary = salary;
        Work = work;
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

    public String getWork() {
        return Work;
    }

    public void setWork(String work) {
        Work = work;
    }
}
