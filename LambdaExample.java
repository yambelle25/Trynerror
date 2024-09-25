import java.util.function.Predicate;

public class LambdaExample {
    
    public static void main(String[] args) {
        Predicate<Integer> isGreaterThan = (num) -> num > 10;
        int number = 15;
        int newNumber = 9;

        if(isGreaterThan.test(number)){
            System.out.println(number + " is greater than 10");
        }else{
            System.out.println(number + " is less than 10");
        }

        if(isGreaterThan.test(newNumber)){
            System.out.println(newNumber + " is greater than 10");
        }else{
            System.out.println(newNumber + " is less than 10");
        }
    }
}