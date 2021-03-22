package guide1.exc2;

public class Employee {
    private int dni;
    private String nameAndSurname;
    private double salary;

    public Employee(){}

    public Employee(int dni, String nameAndSurname, double salary)
    {
        this.dni=dni;
        this.nameAndSurname=nameAndSurname;
        this.salary=salary;
    }


    public void setDni(int dni)
    {
        this.dni=dni;
    }
    public void setNameAndSurname(String nameAndSurname)
    {
        this.nameAndSurname=nameAndSurname;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public int getDNI()
    {
        return this.dni;
    }
    public String getNandS()
    {
        return this.nameAndSurname;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public double annualSalary()
    {
        float yearSalary = (float) (12 * this.salary);
        return yearSalary;
    }
    public void increaseSalary(float percentage)
    {
        this.salary+=(this.salary*percentage)/100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dni=" + getDNI() +
                ", nameAndSurname='" + getNandS() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
