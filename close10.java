public class close10 {
    public static void main(String[] args){
        System.out.println(close10(8,13)); //8
        System.out.println(close10(5,11)); //11
        System.out.println(close10(7,13)); //tie
    }
    public static int close10(int b, int c){
        int distanceb = Math.abs(b - 10);
        int distancec = Math.abs(c - 10);

        if (distanceb < distancec){
            return b; // b is closer to 10
        }else if (distancec < distanceb){
            return c; // c is closer to 10
        } else {
            return 0;
        }
    }
}
