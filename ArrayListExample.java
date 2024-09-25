import java.util.ArrayList;

public class ArrayListExample {
    

    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<>();

        fruits.add("Durian");
        fruits.add("Mangosteen");
        fruits.add("Rambutan");

        //System.out.println("Fruit #1: " + fruits.get(2));

       for(String fruit:fruits){
            System.out.println(fruit);
       }

     fruits.remove(1);
      System.out.println(fruits);
       
     //  for (String fruit:fruits){
     //   System.out.println(fruit);
     //  }
    }
}
