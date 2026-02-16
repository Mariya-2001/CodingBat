public class parrotTrouble {
    public static void main(String[] args){
        System.out.println(parrotTrouble(true,6));
        System.out.println(parrotTrouble(true,20));
        System.out.println(parrotTrouble(false,4));
    }
    public static boolean parrotTrouble(boolean talking, int hour){
        return (talking & (hour < 7 || hour >20));
    }
}
