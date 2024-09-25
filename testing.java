import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEnter your name " + (i + 1) + " :");
            String name = scanner.nextLine();

            System.out.println("Enter your base salary:");
            double baseSalaries = scanner.nextDouble();

            System.out.println("Enter your transport allowance:");
            double transportAllowance = scanner.nextDouble();

            System.out.println("Enter your health allowance:");
            double healthAllowance = scanner.nextDouble();

            scanner.nextLine(); // Consume the newline

            employees[i] = new Employee(name, baseSalaries, transportAllowance, healthAllowance);
        }

        for (Employee employee : employees) {
            String name = employee.getName();
            double totalSalary = employee.calculateTotSalary(); 
            double bonus = employee.bonus(); 

            System.out.println("\nEmployee: " + name);
            System.out.println("Your transport allowance " + transportAllowance);
            System.out.println("Your health allowance " + healthAllowance);
            System.out.println("your total salary include bonus is" + totalSalary);
        }

        scanner.close();
    }
}
