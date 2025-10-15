public class P9 {
    String name;

    P9(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog name: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof P9) {
            P9 p = (P9) obj;
            return this.name.equals(p.name);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = new String("Tommy");
        String s2 = new String("Tommy");

        P9 p1 = new P9(s1);
        P9 p2 = new P9(s2);

        System.out.println(p1);     // calls toString()
        System.out.println(p2);     // toString()
        System.out.println(p1.equals(p2));  //compare object content
        System.out.println(p1.hashCode() + " " + p2.hashCode());
    }
}
