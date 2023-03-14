public class Main {
    public static void main(String[] args) {
        System.out.println(notString("okay"));
    }
    public static String notString(String str){
        if(str.startsWith("not")){
            return str;
        }
        else{
            return ("not "+str);
        }
    }
}