package Warmup1;

public class everyNth {
    public static void main(String[] args){
        System.out.println(everyNth("abcdesf",2)); //acef
        System.out.println(everyNth("nbfdsa",2)); //nfs
        System.out.println(everyNth("poiuyt",3)); //pu
    }
    public static String everyNth(String str, int n){
        StringBuilder res = new StringBuilder();

        for (int i = 0; i< str.length();i+=n){
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
