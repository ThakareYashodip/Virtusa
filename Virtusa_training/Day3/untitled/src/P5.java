public class P5 {
    int area(){
        return 1;
    }
}

class P6 extends P5{
    int volume(){
       return 0;
    }
}

class P7 extends P6{
    void perimeter(){}
}

class smpl{
    public static void main(String[] args) {
        P5 p = new P5();
        System.out.println(p.area());

        P6 d = new P6();
        System.out.println(d.volume());
        System.out.println(d.area());


    }
}

