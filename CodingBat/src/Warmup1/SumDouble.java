package Warmup1;

public class SumDouble {
    public static void main(String[] args){
        checkSumDouble(2,2);
    }
    public static void checkSumDouble(int a,int b){
        if(a==b){
            int sum=2*(a+b);
            System.out.println(sum);
        }
        else if(a!=b){
            int sum=a+b;
            System.out.println(sum);
        }
    }
}
