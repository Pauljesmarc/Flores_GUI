package Management_Exc;

public class Employee extends Person{
    double salary;
    public Employee(String name, int age,double salary) throws IllegalArgumentException {
        super(name, age);
        setSalary(salary);
        if(salary<30000){
            throw new IllegalArgumentException("“Salary must be greater than or equal to 30000");
        }
    }
    public double getSalary() {
        return salary;
    }
    protected void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void performTask() {
        System.out.println(getName()+" is working");
    }
    @Override
    public String toString() {
        return super.toString() + " - "+getSalary();
    }
}