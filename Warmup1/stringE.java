package Warmup1;

public class stringE {
    public static void main(String[] args){
        System.out.println(stringE("Hee")); //true
        System.out.println(stringE("He")); //true
        System.out.println(stringE("eeee")); //false
    }
    public static boolean stringE(String str){
        int count = 0; // initiate the number of e to 0

        for (char c : str.toCharArray()) {
            if (c == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

}
