public class project {
    public static void main(String[] args){
        System.out.println(getSum(10,2));
        System.out.println(getReminder(10,2));
        printNameSixTimes("sunil");
    }
    public static int getSum(int a,int b){
        int sum=(a+b);
        return sum;
    }
    public static int getReminder(int a,int b){
        int reminder=(a%b);
        return reminder;
    }
    public static void printNameSixTimes(String a){
        for(int i=0;i<6;i++){
            System.out.println(a);
        }
    }
}
