package Warmup1;

public class startOz {
    public static void main(String[] args){
        System.out.println(startOz("oznhgafds"));
        System.out.println(startOz("nmjhsa"));
        System.out.println(startOz("ossss"));
    }

    public static String startOz(String s){
        StringBuilder res = new StringBuilder();

        if (s.length() > 0 && s.charAt(0) == 'o'){
            res.append("o");
        }
        if (s.length() > 1 && s.charAt(1) == 'o'){
            res.append("z");
        }
        return res.toString();
    }
}
