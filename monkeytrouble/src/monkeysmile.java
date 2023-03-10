public class monkeysmile {
    public static void main(String[] args){
        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(true,false));
        System.out.println(monkeyTrouble(false,true));
        System.out.println(monkeyTrouble(false,false));
    }
    public static boolean monkeyTrouble(boolean aSmile,boolean bSmile){
        if(aSmile==true&&bSmile==true){
            return true;
        }
        else if(aSmile==false &&bSmile==false){
            return true;
        }
        else {
            return false;
        }
    }
}
