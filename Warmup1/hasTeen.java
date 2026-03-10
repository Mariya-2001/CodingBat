package Warmup1;

public class hasTeen {
    public static void main(String[] args){
        System.out.println(hasTeen(13,15,17));
        System.out.println(hasTeen(10,12,13));
    }
    public static boolean hasTeen(int x , int y , int z){
        return (x >= 13 && x <=19) ||
                (y >= 13 && y <=19) ||
                (z >= 13 && z <=19);
    }
}
