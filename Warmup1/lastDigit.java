package Warmup1;

public class lastDigit {
    public static void main(String[] args){
        System.out.println(lastDigit(6,16));
        System.out.println(lastDigit(5,17));
        System.out.println(lastDigit(2,112));
}

public static boolean lastDigit(int b, int c){

        return (   (b%10)  == (c%10) );

    }
}
