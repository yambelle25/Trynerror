public class gpa {
    private double mygpa;
    private String text;
    private int years;

    public gpa (double mygpa, String text, int years) {
        this.mygpa = mygpa;
        this.text = text;
        this.years = years;
    }

    public void displayDetail () {
        System.out.println("I got" + " " + mygpa + " " + "last semester");
        System.out.println("I'm studying in" + " " + text);
        System.out.println("i'm studying in UiTM for" + " " + years + " " + "years");

    }

    public static void main(String[] args) {
        gpa gpa = new gpa(3.4, "UiTM", 2);
        gpa.displayDetail();
    }
}

