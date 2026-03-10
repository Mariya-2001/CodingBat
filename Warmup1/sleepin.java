package Warmup1;

public class sleepin {
    public boolean sleepin(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        sleepin s = new sleepin();

        System.out.println(s.sleepin(false,false));
        System.out.println(s.sleepin(true,false));
        System.out.println(s.sleepin(false,true));
    }


}
