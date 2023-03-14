package Warmup1;

public class parrotTrouble {
    public static void main(String[] args){
        System.out.println(parrotTrouble(true,10));
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if((talking==true)&&(hour<7||hour>20)){
            return true;
        }
        else{
            return false;
        }
    }
}
