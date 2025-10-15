public class P2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // false
        System.out.println(s3==s4); // pointing to different address

        System.out.println(s1.equals(s3));

        String s5= s3.intern(); // pointing to the same address
        System.out.println(s5==s3); // true

        String s6 = new String("Java").intern(); // If content is same then it's pointing to the same address
        System.out.println(s6 == s1); // true
    }
}
