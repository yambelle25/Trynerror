import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;


class Employee {
    private String name;
    private double salary;
    private double healthAllowance;
    private double transportAllowance;

    public Employee(String name, double salary, double healthAllowance, double transportAllowance) {
        this.name = name;
        this.salary = salary;
        this.transportAllowance = transportAllowance;
        this.healthAllowance = healthAllowance;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getTansportAllowance() {
        return transportAllowance;
    }

    public double getHealthAllowance() {
        return healthAllowance;
    }


    public void displayPayslip() {
        
        double bonus = 0;
        
        if (salary > 51000) {
            bonus = salary * 0.10; // 10% bonus
        }
        else if (salary >= 30000 && salary <= 50000) {
            bonus = salary * 0.05; // 5% bonus
        } else {
            bonus = 0; // No bonus
        }

        double totalSalary = salary + healthAllowance + transportAllowance + bonus;

        // Format current date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println("=== Payslip for " + name + " ===");
        System.out.println("Base Salary:RM " + salary);
        System.out.println("Health Allowance: RM" + healthAllowance);
        System.out.println("Transport ALowwance: RM" + transportAllowance);
        System.out.println("Bonus: RM " + bonus);

        Predicate<Double> isGreaterThan = (number) -> number > 1000;
        //double salary = 0;

        if(isGreaterThan.test(bonus)){
            System.out.println(" Congrats! You have earned a bonus of more than RM 1000!");
        }

        else{
            System.out.println("You are bad");
        }

        System.out.println("Total Salary: RM " + totalSalary);
        System.out.println("Date of Payslip: " + dtf.format(now));
        System.out.println("  ");
        
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {

        

        // ArrayList to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Radiatul", 55000,120,80));
        employees.add(new Employee("SYida", 1000,120,80));
        employees.add(new Employee("Belle", 48000,120,80));
        employees.add(new Employee("Mai", 23000, 120,80));

        for (Employee emp : employees) {
            emp.displayPayslip();
            System.out.println();
        }
    }
}