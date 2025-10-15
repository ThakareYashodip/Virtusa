public class InterfaceExample {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.add();
        obj.sub();
    }
}

interface A{
    public  void add();
    public static final String name = "Revature";
}

interface B{
    public void sub();
}

class Demo implements A,B{
    @Override
    public void add() {
        System.out.println("Interface A");
    }
    public void sub() {
        System.out.println("Interface B");
    }
}