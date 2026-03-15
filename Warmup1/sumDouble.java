package Warmup1;

public class sumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(4, 3));
        System.out.println(sumDouble(5, 5));
    }

    public static int sumDouble(int x, int y) {
        int sum = x + y;

        if (x == y)
        {
            sum = sum * 2;
        }
            return sum;
    }
}
