import java.util.Arrays;

public class P3 {
    public static void main(String[] args) {
        int [] a=  {1,2,3};
        int [] b= a ;
        b[0] = 10 ;
        System.out.println(b[0]);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
