public class P4 {
    String name;
    int age;
    static String college = "Revature";

    void P4(String name){
        this.name = name;
    }

    void display() {
        System.out.println("Name And College name is: " + name + " & " + college);
    }

    public static void main(String[] args) {
        P4 p = new P4();
        p.age = 21;
        p.name = "Yash";
        p.display();
        P4.college = "HMS";
        p.display();
    }
}
