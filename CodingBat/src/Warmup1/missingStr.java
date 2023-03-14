package Warmup1;

public class missingStr{
    public static void main(String[] args){
        System.out.println(missingChar("kitten",2));
    }
    public static String missingChar(String str, int n) {
        return (str.substring(0,n)+str.substring(n+1,str.length()));
    }
}
