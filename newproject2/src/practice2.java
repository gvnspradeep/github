public class practice2 {
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println(getSum(2, 3));
        System.out.println(getDiff(2, 3));
        System.out.println(getProduct(2,3));
        System.out.println(getQuotient(4,2));

        printEvenNumbers(10);
    }

    public static void printEvenNumbers(int n){
//        for(int i=0;i<=n;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
        while(int i<=n){
            
            i++;
        }
    }
    public static int getSum(int a, int b) {
        int sum = (a + b);
        return sum;
    }

    public static int getDiff(int a, int b) {
        int diff;
        if (a > b) {
            diff = (a - b);
        } else {
            diff = (b - a);
        }
        return diff;
    }
    public static int getProduct(int c,int d){
        int product=(c*d);
        return product;
    }
    public static int getQuotient(int e,int f){
        int quotient=(e/f);
        return quotient;
    }

}
