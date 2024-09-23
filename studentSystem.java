import java.util.*;

// Continous from student
public class studentSystem {
    public static void main(String[] args) {
        
        Student[] students = new Student [5];        
        
        students[0] = new Student("Maryam", new int[]{83, 92, 78});
        students[1] = new Student("Radiatul", new int[]{88, 72, 81});
        students[2] = new Student("Fatihah", new int[]{95, 89, 94});
        students[3] = new Student("Afiqah", new int[]{28, 72, 60});
        students[4] = new Student("Najihah", new int[]{55, 12, 58});

        
        for (Student student : students) {
            double average = student.calculateAverage(); 
            char grade = student.assignGrade(); 

            
            System.out.println("Student: " + student.getName());
            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);
        }
    }
}