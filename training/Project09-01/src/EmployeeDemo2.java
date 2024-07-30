import java.util.Random;

public class EmployeeDemo2 {
    private enum EmployeeType {
        WORKER,
        MANAGER
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            EmployeeType et = getEmployeeType();
            Employee currentEmployee;

            if (et == EmployeeType.WORKER) {
                currentEmployee = new Worker("Will", "Durant", 30);
            }
            else {
                currentEmployee = new Manager("John", "Doe", 40);
            }
            employees[i] = currentEmployee;
        }
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getFirstName()
                    + " " + employee.getLastName() + ", age " + employee.getAge()
                    + " says, "
            );
            System.out.println("\t" + employee.work() + "\n");
        }

    }
    public static EmployeeType getEmployeeType() {
        EmployeeType result;
        Random rand = new Random();
        final int UPPER_BOUND = 2;
        int whichOne = rand.nextInt(UPPER_BOUND);
//        switch (whichOne) {
//            case 0:
//                result = EmployeeType.WORKER;
//                break;
//            case 1:
//                result =  EmployeeType.MANAGER;
//                break;
//        }
        if (whichOne == 1) {
            result = EmployeeType.WORKER;
        }
        else {
            result = EmployeeType.MANAGER;
        }
        return result;
    }
}
