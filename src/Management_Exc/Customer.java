package Management_Exc;

public class Customer extends Person{

    public Customer(String name, int age) throws ClassCastException {
        super(name, age);
    }
    @Override
    public void performTask() {
        System.out.println(getName() + " is browsing through");
    }
    public void speak(Employee a){
        if(a instanceof Developer && this.getAge() > a.getAge()){
            if(((Developer) a).projectManager!=null){
                System.out.println("Can I see your manager "+((Developer) a).projectManager.getName()+"?");
            }else {
                System.out.println("Oh, hello, " + a.getName()+". Can you assist me?");
            }
        }else {
            System.out.println("Oh, hello, " + a.getName()+". Can you assist me?");
        }
    }
}