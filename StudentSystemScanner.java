import java.util.Scanner;

// Continous from student
public class StudentSystemScanner {
    public static void main(String[] args) {
        
        StudentScanner[] StudentScanners = new StudentScanner [3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < StudentScanners.length; i++){
            System.out.println("Enter name of student" + (i+1) +" :");
            String name = scanner.nextLine();

            System.out.println("Enter your Score Math");
            int mathscore = scanner.nextInt();

            System.out.println("Enter your Score Science");
            int sciencescore = scanner.nextInt();
            
            System.out.println("Enter your Score English");
            int englishscore = scanner.nextInt();
            scanner.nextLine();

            StudentScanners[i] =  new StudentScanner (name, mathscore, sciencescore, englishscore);

        }

        
        for (StudentScanner StudentScanner : StudentScanners) {
            String name = StudentScanner.getName();
            double average = StudentScanner.calculateAverage(); 
            char grade = StudentScanner.assignGrade(); 

            
            System.out.println("\n Student:" + StudentScanner.getName());
            System.out.println("Your Average Score: " + average);
            System.out.println(grade);
        }

        scanner.close();
    }
}
