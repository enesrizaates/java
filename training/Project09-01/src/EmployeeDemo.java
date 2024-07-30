import java.util.ArrayList;
import java.util.Random;

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager john = new Manager("John", "Due", 30);
        Manager jack = new Manager("Jack", "Due", 40);
        Worker jim = new Worker("Jim", "Due", 30);
        Worker avarel = new Worker("Avarel", "Due", 40);
        Manager redkit = new Manager("Redkit", "Due", 30);

//        ArrayList<Employee> myEmployees = new ArrayList<>();
        Employee[] myEmployees = new Employee[5];
//        myEmployees.add(john);
//        myEmployees.add(jack);
//        myEmployees.add(jim);
//        myEmployees.add(avarel);
//        myEmployees.add(redkit);
        myEmployees[0] = john;
        myEmployees[1] = jack;
        myEmployees[2] = jim;
        myEmployees[3] = avarel;
        myEmployees[4] = redkit;

        for (Employee employee : myEmployees) {
            System.out.println("Name: " + employee.getFirstName()
                    + " " + employee.getLastName() + ", age " + employee.getAge()
                    + " says, "
            );
            System.out.println("\t" + employee.work() + "\n");
        }
    }
}
