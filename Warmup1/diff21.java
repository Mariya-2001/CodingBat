package Warmup1;

public class diff21 {
    public static int Diff21(int n)
    {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return 21 - n;
        }
    }

public static void main(String[] args) {
    System.out.println(Diff21(21));
    System.out.println(Diff21(18));
}
}