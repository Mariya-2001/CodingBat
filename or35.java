public class or35 {
    public static void main(String[] args){
        System.out.println(or35(4)); // return false
        System.out.println(or35(19)); // return false
        System.out.println(or35(10)); // return true
    }
    public static boolean or35(int i){
        return ( i%3 == 0 || i%5 == 0 );
    }

}
