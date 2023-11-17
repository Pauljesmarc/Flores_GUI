package Management_Exc;

public class Manager extends Employee {
    public Manager(String name, int age,double salary) throws IllegalArgumentException {
        super(name, age,salary);
    }
    public void giveRaise(Employee a,double inc){
        if(inc<0){
            throw new IllegalArgumentException("Raise must be non-negative");
        }else{
            a.setSalary(getSalary()+inc);
        }
    }
    @Override
    public String toString() {
        return "Mgr. "+ super.toString();
    }
}