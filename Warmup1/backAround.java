package Warmup1;

public class backAround {
    public static void main(String[] args){
        System.out.println(backAround("Cat"));
        System.out.println(backAround("hello"));
        System.out.println(backAround("a"));
    }
    public static String backAround(String str){
        char lastCharacter = str.charAt(str.length() - 1);

        return lastCharacter + str + lastCharacter;
    }
}
