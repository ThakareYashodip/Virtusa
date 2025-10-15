public class P1 {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Hello");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" , World !");

        sb.insert(5,"Java");

        sb.delete(5,10);

        System.out.println(sb);
    }
}
