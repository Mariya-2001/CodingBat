public class missingChar {
    public static String missingChar(String str, int n) {
        String first = str.substring(0,n);

        String last = str.substring(n+1 , str.length());

        return first + last;
    }

    public static void main(String[] args){
        System.out.println(missingChar("mariya",4));
    }
}
