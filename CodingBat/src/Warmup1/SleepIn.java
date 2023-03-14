package Warmup1;

public class SleepIn {
    public static void main(String[] args){
        System.out.println(sleepIn(true,false));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(weekday!=true || vacation == true){
            return true;
        }
        else {
            return false;
        }
    }
}
