import java.util.Date;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private Date hireDate;

    public Employee(String name, int id, double salary, Date hireDate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    @Override
    public String toString() {
        return "Employee : \n" +
                "\nname : " + name +
                "\nid : " + id +
                "\nsalary : " + salary +
                "\nhireDate : " + hireDate;
    }
}
