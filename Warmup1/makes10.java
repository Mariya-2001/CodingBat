package Warmup1;

public class makes10 {
    public static void main(String[] args){
        System.out.println(makes10(12,10));
        System.out.println(makes10(4,6));
        System.out.println(makes10(5,7));
    }


    public static boolean makes10(int f, int d){
        return (f == 10 || d == 10 || f+d ==10);
    }
}
