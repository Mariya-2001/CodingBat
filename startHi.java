public class startHi {
    public static void main(String[] args){
        System.out.println(starthi("hi there"));
        System.out.println(starthi("there"));
    }
    public static boolean starthi(String str){
        return str.length() >= 2 && str.startsWith("hi");
    }
}
