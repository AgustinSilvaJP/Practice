import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        ArrayList<Employee> empleados = new ArrayList<>();
        int num;
        String name;
        String job;
        double salary;

        do{
            System.out.print("Name: ");
            name = asd.next();
            asd.nextLine();
            System.out.print("Job: ");
            job = asd.nextLine();

            System.out.print("Salary: ");
            salary = asd.nextDouble();

            empleados.add(new Employee(name, job, salary));

            System.out.print("Add a new employee? type 0 or 1: ");
            num = asd.nextInt();
        }while(num == 1);
        System.out.println("-----------------------------------------");

        for(Employee employee: empleados){
            System.out.printf("Name: " + employee.getName() + ", job: " + employee.getJobTitle() + ", salary: " + employee.getSalary() + "\n");
            System.out.print("Do you want to raise the salary of: " + employee.getName() + "? (0 or 1): ");
            num = asd.nextInt();
            if(num == 1){
                System.out.print("Type the porc. of raise: ");
                employee.raiseSalary(asd.nextDouble());
            }
        }//fin for each
        System.out.println("=================================================");
        for(Employee employee: empleados){
            System.out.printf("Name: " + employee.getName() + ", job: " + employee.getJobTitle() + ", salary: " + employee.getSalary() + "\n");
        }
    }
}