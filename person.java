public class person {
    private String name;
    private int age;

    public person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetail () {
        System.out.println("Name is" + " " + name);
        System.out.println("Name is" + " " + age);
    }

    public static void main(String[] args) {
        person person = new person("Belle", 23);
        person.displayDetail();
    }
}
