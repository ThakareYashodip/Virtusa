public class P8 {
    public static void main(String[] args) {
        Deemo d = new Deemo();
        d.sleep();
        d.sound();
    }
}

abstract class Animal {
    abstract void sleep();

    void sound() {
        System.out.println("Sound");
    }
}

class Deemo extends Animal {
    void sleep() {}

}
