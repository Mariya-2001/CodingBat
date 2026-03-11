package Warmup1;

public class IoneTeen {
    public static void main(String[] args){
        System.out.println(IoneTeen(14,88));
        System.out.println(IoneTeen(22,33));
        System.out.println(IoneTeen(13,13));
    }

    public static boolean IoneTeen(int x,int z){
        boolean isxTeen = (x >= 13 && x<= 19);
        boolean iszTeen = (z >= 13 && z<= 19);


        return (isxTeen || iszTeen) && !(isxTeen && iszTeen);
    }

}
