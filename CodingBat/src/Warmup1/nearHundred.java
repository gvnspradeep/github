package Warmup1;

public class nearHundred{
    public static void main(String[] args){
        System.out.println(make10(100));
    }
    public static boolean make10(int n){
        if((n>=90)&&(n<=110)||(n>=190)&&(n<=210)){
            return true;
        }
        else{
            return false;
        }
    }
}

