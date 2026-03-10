package Warmup1;

public class posNeg {
    public static void main(String[] args){
        System.out.println(posNeg(2,-2,true));
        System.out.println(posNeg(-2,2,true));
        System.out.println(posNeg(-5,-2,false));
    }
    public static boolean posNeg(int x, int y , boolean neg){
        if(neg) {
            return (x < 0 && y < 0);
        } else{
            return ((x < 0 && y <0) || x > 0 && y < 0);
        }
    }
}
