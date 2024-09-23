class Animal { //super class (boleh letak nama pape selain nama file)
    public void sound() { //kalau nak buat inheritance, after buta super class kena letak ni
    System.out.println("sounds like");
}}

class dog extends Animal {
    @Override // override guna kalau function sama 
    public void sound() { // cth sound
        System.out.println("woof woof");
    }
}
class cat extends Animal {
    @Override // override guna kalau function sama 
    public void sound() {
        System.out.println("meow");
    }
}

public class Polymorphism   { // kena letak nama file

public static void main(String[] args) { // untuk panggil balik all declaration
    Animal myAnimal = new dog(); //after letak anima sekali, untuk next attributes, tak perlu letak
    myAnimal.sound();

    myAnimal = new cat();
    myAnimal.sound();

}
}
