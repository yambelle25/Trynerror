public class equal {
    public static void main(String[] args) {
        String strg1 = "hai";
        String strg2 = "hai";
        String strg3 = new String("hai");
   
        System.out.println(strg1 == strg2);
        System.out.println(strg1 == strg3); //== is absolute equals value
        System.out.println(strg1.equals(strg3)); //equals give java power to change to positive answer (true)
        System.out.println(strg1.equals(strg2));
    }
}
