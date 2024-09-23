class Haiwan { // untuk semicolon super class inheritance
    public void eat(){
        System.out.println("What dows the fox say");
    }
} // untuk super class aasing kan section

class Doggo extends Haiwan{
    public void barking() { // after function takde semicolon;
        System.out.println("gon gong gong");
    }
}

public class Inheritence { // sama nama file

    public static void main(String[] args) {
        // String doggo = new String();
        Doggo doggo = new Doggo();
        doggo.eat();
        doggo.barking();

    }
}

