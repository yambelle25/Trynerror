public class StringManupulation {
    
    public static void main(String[] args) {
        String str = "Hello ";
        String newStr= str.concat("world");
        String lowerstr = newStr.toLowerCase();
        String subStr = newStr.substring(0,5);
        String replaceString = newStr.replace ("world", "Java");

        System.out.println(newStr);
        System.out.println(lowerstr);
        System.out.println(subStr);
        System.out.println(replaceString);
    }
}
