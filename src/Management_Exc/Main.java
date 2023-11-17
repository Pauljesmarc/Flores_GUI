package Management_Exc;

import java.util.*;
    public class Main {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            List<Person> persons = new ArrayList<Person>();
            String input, name, name2;
            int age;
            double salary;
            while (true){
                System.out.print("Enter person type: ");
                input = sc.nextLine();
                if (input.equals("DONE")) {
                    break;
                }
                switch (input.charAt(0)) {
                    case 'c':
                        System.out.print("Enter customer name: ");
                        name = sc.nextLine();
                        System.out.print("Enter customer age: ");
                        age = sc.nextInt();
                        // TODO add new Customer in persons here
                        Person customer = new Customer(name,age);
                        persons.add(customer);
                        break;
                    case 'e':
                        System.out.print("Enter employee name: ");
                        name = sc.nextLine();
                        System.out.print("Enter employee age: ");
                        age = sc.nextInt();
                        System.out.print("Enter employee salary: ");
                        salary = sc.nextDouble();
                        // TODO add new Employee in persons here
                        Person employee = new Employee(name,age,salary);
                        persons.add(employee);
                        break;
                    // TODO add more cases for other Person subclasses here
                    case 'd':
                        System.out.print("Enter developer name: ");
                        name = sc.nextLine();
                        System.out.print("Enter developer age: ");
                        age = sc.nextInt();
                        System.out.print("Enter developer salary: ");
                        salary = sc.nextDouble();
                        // TODO add new Employee in persons here
                        Person developer = new Developer(name,age,salary);
                        persons.add(developer);
                        break;
                    case 'm':
                        System.out.print("Enter manager name: ");
                        name = sc.nextLine();
                        System.out.print("Enter manager age: ");
                        age = sc.nextInt();
                        System.out.print("Enter manager salary: ");
                        salary = sc.nextDouble();
                        // TODO add new Employee in persons here
                        Person manager = new Manager(name,age,salary);
                        persons.add(manager);
                        break;

                }
                sc.nextLine();
            }
            while (true) {
                System.out.print("Enter action: ");
                input = sc.nextLine();
                switch (input) {
                    case "DONE":
                        return;
                    case "Birthday":
                        System.out.print("Whose birthday? ");
                        name = sc.nextLine();
                        // TODO find name and call birthday
                        int bctr=0;

                        for (Person p: persons) {
                            if(Objects.equals(p.getName(),name)){
                                bctr=1;
                            }
                        }
                        if(bctr!=1){
                            System.out.println("Invalid input");
                        }else{
                            for (Person p: persons) {
                                if(Objects.equals(p.getName(),name)){
                                    if(p instanceof Developer){
                                        if(((Developer) p).projectManager!=null){
                                            double newsalary  = ((Developer) p).projectManager.getSalary()+((((Developer) p).getSalary()*0.05)/2.0);
                                            ((Developer) p).setSalary((((Developer) p).getSalary()+(((Developer) p).getSalary()*0.05)));
                                            ((Developer) p).projectManager.setSalary(newsalary);
                                            System.out.println(p.birthday());
                                            break;
                                        }else {
                                            System.out.println(p.birthday());
                                        }
                                    }else{
                                        System.out.println(p.birthday());
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case "Assign PM":
                        System.out.print("Select developer: ");
                        name = sc.nextLine();
                        System.out.print("Select manager: ");
                        name2 = sc.nextLine();
                        // TODO find developer "name" and manager "name2" and assign PM
                        assignPM(persons,name,name2);
                        break;

                    case "Perform Task":
                        for (int i = 0; i < persons.size(); i++) {
                            persons.get(i).performTask();
                        }
                        break;
                    case "Give Raise":
                        System.out.print("Enter manager: ");
                        name = sc.nextLine();
                        System.out.print("Enter employee: ");
                        name2 = sc.nextLine();
                        System.out.print("Enter increase: ");
                        double inc = sc.nextDouble();
                        sc.nextLine();
                        giveRaise(persons,name,name2,inc);
                        break;
                    case "Customer Speak":
                        System.out.print("Select customer: ");
                        name = sc.nextLine();
                        System.out.print("Select employee: ");
                        name2 = sc.nextLine();
                       customerSpeak(persons,name,name2);
                        break;
                    case "Person List":
                        int i=0;
                        int pctr=0;
                        for (i = 0; i < persons.size(); i++){
                            pctr++;
                            System.out.println(persons.get(i));
                        }
                        if(pctr==0){
                            System.out.println("No persons in list");
                        }else{
                            System.out.println("Total Count: "+pctr);
                        }
                        break;
                    case "Developer List":
                        i=0;
                        int dctr=0;
                        for (i = 0; i < persons.size(); i++){
                            if(persons.get(i) instanceof Developer){
                                dctr++;
                                System.out.println(persons.get(i));
                            }
                        }
                        if(dctr==0){
                            System.out.println("No developers in list");
                        }else{
                            System.out.println("Total Count: "+dctr);
                        }
                        break;
                    case "Manager List":
                        i=0;
                        int mctr=0;

                        for (i = 0; i < persons.size(); i++){
                            if(persons.get(i) instanceof Manager ){
                                mctr++;
                                System.out.println(persons.get(i));
                            }
                        }
                        if(mctr==0){
                            System.out.println("No managers in list");
                        }else {
                            System.out.println("Total Count: " + mctr);
                        }
                        break;
                    case "Employee List":
                        i=0;
                        int ectr=0;
                        for (i = 0; i < persons.size(); i++){
                            if(persons.get(i) instanceof Employee ){
                                ectr++;
                                System.out.println(persons.get(i));
                            }
                        }
                        if(ectr==0){
                            System.out.println("No employees in list");
                        }else{
                            System.out.println("Total Count: "+ectr);
                        }
                        break;
                    case "Customer List":
                        i=0;
                        int cctr=0;
                        for (i = 0; i < persons.size(); i++){
                            if(persons.get(i) instanceof Customer ){
                                cctr++;
                                System.out.println(persons.get(i));
                            }
                        }
                        if(cctr==0){
                            System.out.println("No customers in list");
                        }else{
                            System.out.println("Total Count: "+cctr);
                        }
                        break;
                    // TODO add more action cases here
                    default:
                        System.out.println("Invalid action");
                }
            }
        }
    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */
    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {
        int mflag=0;
        int cflag=0;
        double halfInc = (salary/2.0);
        for (Person m : persons) {
            if(Objects.equals(m.getName(),manager) && m instanceof Manager){
                mflag=1;
                break;
            }else{
                if(!(m instanceof  Manager))
                    throw new ClassCastException(manager+" is not a manager");
                }
        }
        for (Person c : persons) {
            if(Objects.equals(c.getName(),employee) && c instanceof Employee){
                cflag=1;
                break;
            }else{
                if(!(c instanceof  Employee))
                    throw new ClassCastException(employee+" is not a employee");
            }
        }

        if(mflag!=1 || cflag==1){
            if(cflag==0){
                throw new NoSuchElementException(employee +" does not exist");
            }
            if(mflag==0){
                throw new NoSuchElementException(manager +" does not exist");
            }
        }else{
            if(salary>0){
                for (Person m : persons) {
                    if(m instanceof Manager && Objects.equals(m.getName(),manager)){
                        for (Person e : persons) {
                            if(Objects.equals(manager,employee)){
                                ((Manager) m).setSalary(((Manager) m).getSalary()+salary);
                                break;
                            }
                            if(e instanceof Employee && Objects.equals(e.getName(),employee)){
                                ((Employee) e).setSalary(((Employee) e).getSalary()+salary);
                                ((Manager) m).setSalary(((Manager) m).getSalary()+halfInc);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developer, String manager) {
        int dctr =0;
        int mctr =0;

        for (Person d: persons) {
            if(d instanceof Developer && Objects.equals(d.getName(),developer)){
                dctr=1;
            }
            else {
                if(!(d instanceof  Developer))
                throw new ClassCastException(developer+" is not a developer");
            }
        }
        for (Person m: persons) {
            if(Objects.equals(manager, "NULL")){
                mctr=1;
            }
            if(m instanceof Manager && Objects.equals(m.getName(),manager)){
                mctr=1;
            }else{
                if(!(m instanceof  Manager))
                    throw new ClassCastException(manager+" is not a manager");
            }
        }
        if(dctr==1 && mctr==1){
            for (int i = 0; i < persons.size(); i++) {
                if(persons.get(i) instanceof Developer && persons.get(i).getName().equals(developer)){
                    if(Objects.equals(manager, "NULL")){
                        ((Developer) persons.get(i)).removePM();
                    }else{
                        for (int j = 0; j < persons.size(); j++) {
                            if(persons.get(j) instanceof Manager && persons.get(j).getName().equals(manager)){
                                ((Developer) persons.get(i)).setProjectManager((Manager)persons.get(j));
                            }
                        }
                    }
                }
            }
        }else{
            if(dctr==0){
                throw new NoSuchElementException(developer +" does not exist");
            }
            if(mctr==0){
                throw new NoSuchElementException(manager +" does not exist");
            }
        }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param customer the customer to speak to the employee
     * @param employee the employee to be spoken to
     * @return the dialogue of the customer to the employee
     * @throws IllegalArgumentException when given customer or employee is not what they are
     * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        int eflag=0;
        int cflag=0;

        for (Person c : persons) {
            if(Objects.equals(c.getName(),customer) && c instanceof Customer){
                cflag=1;
                break;
            }else{
                if(!(c instanceof Customer))
                    throw new ClassCastException(customer+" is not a customer");
            }
        }

        for (Person e : persons) {
            if(Objects.equals(e.getName(),employee) && e instanceof Employee){
                eflag=1;
                break;
            }else{
                if(!(e instanceof  Manager))
                    throw new ClassCastException(employee+" is not a employee");
            }
        }
        if(eflag!=1 || cflag!=1){
            if(eflag==0){
                throw new NoSuchElementException(customer +" does not exist");
            }
            if(cflag==0){
                throw new NoSuchElementException(employee +" does not exist");
            }
        }else{
            for (Person c: persons) {
                if(Objects.equals(c.getName(),customer) && c instanceof Customer){
                    for (Person e : persons) {
                        if(Objects.equals(e.getName(),employee) && e instanceof Employee){
                            ((Customer) c).speak((Employee) e);
                        }
                    }
                }
            }
        }
        return null;
    }
}


