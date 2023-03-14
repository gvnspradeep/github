package Warmup1;

public class posNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(2,3,true));
    }
        public static boolean posNeg(int a,int b,boolean negative){
            if (negative == true) {
                if (a < 0 && b < 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }

