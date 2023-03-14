package Warmup1;

public class notString {
    public static void main(String[] args){
        System.out.println(notString("yak"));
    }
    public static String notString(String str){
        if(str.startsWith("not")){
            return str;
        }
        else{
            return "not "+str;
        }
    }
}
