package Warmup1;

public class icyHot {
    public static void main(String[] args){

        System.out.println(icyHot(120,-1)); // return false
        System.out.println(icyHot(-2,110)); // return true
        System.out.println(icyHot(3,129)); // return false
        }

        public static boolean icyHot(int temprature1, int temprature2){
        return ((temprature1 < 0 && temprature2 > 100 )|| (temprature1 < 100 && temprature2 < 0));
    }
}
