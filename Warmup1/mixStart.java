package Warmup1;

public class mixStart {
    public static void main(String[] args){
        System.out.println(mixStart("mix mm"));
        System.out.println(mixStart("pix nn"));
        System.out.println(mixStart("ix"));
    }
    public static boolean mixStart(String str){
        return str.length() >= 3 && str.substring(1,3).equals("ix");
        // length should be equal or more than 3 +
        // the second and third letter should contain ix (starts in index 1 and stops in index 3)
    }
}
