package Management_Exc;

public class Developer extends Employee{
    Manager projectManager;
    public Developer(String name, int age,double salary) throws IllegalStateException {
        super(name, age,salary);
    }
    public Manager getProjectManager() {
        return projectManager;
    }
    public void setProjectManager(Manager projectManager) {
        if(this.projectManager !=null){
            throw new IllegalStateException("name already has a manager: " + projectManager.getName());

        }else{
            this.projectManager = projectManager;
        }
    }
    public void removePM(){
        this.projectManager=null;
    }
    @Override
    public String birthday() {
        return super.birthday();
    }
    @Override
    public void performTask() {
        System.out.println(getName()+" is coding");
    }
    @Override
    public String toString() {
        if(projectManager!=null){
            return super.toString()+" ["+ projectManager.getName()+"]";
        }
        return super.toString();
    }
}