package Warmup1;

public class diff21 {
    public static void main(String[] args){
        System.out.println(Diff21(1));
    }
    public static int Diff21(int n){
        if(n>21){
            return (2*Math.abs(n-21));
        }
        else{
            return Math.abs(n-21);
        }
    }
}
