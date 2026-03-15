package Warmup1;

public class in3050 {
    public static void main(String[] args){
        System.out.println(in3050(30,21));
        System.out.println(in3050(41,45));
        System.out.println(in3050(30,50));
    }

    public static boolean in3050(int x,int y){
        boolean firstRange = (x >= 30 && x <= 40) && (y >= 30 && y <= 40);
        boolean secondRange = (x >= 40 && x <= 50) && (y >= 40 && y <= 50);
        return firstRange || secondRange;
    }
}
