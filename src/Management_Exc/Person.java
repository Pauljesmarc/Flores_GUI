package Management_Exc;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {

        if(age<0){
            throw new IllegalArgumentException("“Age must be non-negative”");
        }
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void performTask(){};
    public String birthday() {
        this.age+=1;
        return  "Happy birthday, "+ getName()+"!";
    }

    @Override
    public String toString() {
        return getName() + " ("+getAge()+")";
    }
}