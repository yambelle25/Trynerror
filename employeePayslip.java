import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class employeePayslip {

    private String employeesName;
    private double baseSalary;
    private double bonus;
    private double totalSalary;

    public employeePayslip (String employeesName,double baseSalary){
        this.employeesName = employeesName;
        this.baseSalary=baseSalary; 
        this.bonus = 0.0;
        this.totalSalary= 0.0;}

        public String getEmployeesName(){
            return employeesName;
        }
    
        public double getBaseSalary(){
            return baseSalary;
        }

        public double calculateTotalSalary(){
            totalSalary = baseSalary +  bonus ;
            return totalSalary;
        }
    
        public void assignBonus() {
            if (baseSalary > 50000) {
                bonus = baseSalary * 0.10; // 10% bonus
            } else if (baseSalary >= 30000 && baseSalary <= 50000) {
                bonus = baseSalary * 0.05; // 5% bonus
            } else {
                bonus = 0; // No bonus
            }
        }
    

    public static void main(String[] args) {
        ArrayList<String>employeesName = new ArrayList<>();

        employeesName.add("Radiatul");
        employeesName.add("Syida");
        employeesName.add("Belle");

        for(String employeeName:employeesName){
            System.out.println(employeeName);
       }
    }
    
}
