import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    
    public class DateTimeExample {
        public static void main(String[] args) {
            LocalDateTime nowDT = LocalDateTime.now();
            LocalDate nowD = LocalDate.now();
            LocalTime nowT = LocalTime.now();
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDT = formatter.format(nowDT);

            LocalDate birthDate =  LocalDate.of(2001, 01, 25);
            Period belleAge = Period.between(nowD, birthDate);

            System.out.println(nowDT);
            System.out.println(nowD);
            System.out.println(nowT);
            System.out.println(formattedDT);
            System.out.println(belleAge);
    
        }
    }
