class Haiwan {
    public void sound(){
        System.out.println("Bunyi apa tu?");
    }
}

class Cat extends Haiwan {
    public void mengiaw(){
        System.out.println("meow");
    }
}

public class Casting {

    public static void main(String[] args) {
        Haiwan myHaiwan = new Cat();
        myHaiwan.sound();

        if (myHaiwan instanceof Cat) { // nak casting guna instanceof
            Cat myCat = (Cat) myHaiwan; // casting maksudnya nak print out semua value termasuk super class dan sub class
            myCat.mengiaw();
        }
}
}