package Warmup1;

public class monkeyTrouble{
    public static void main(String[] args){
        System.out.println(MonkeyTrouble(true ,false));
    }
    public static boolean MonkeyTrouble(boolean aSmile,boolean bSmile){
            if((aSmile==true&&bSmile==true)||(aSmile==false&&bSmile==false)){
                return true;
            }
            else{
                return false;
            }
        }
}
