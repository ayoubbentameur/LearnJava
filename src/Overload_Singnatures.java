public class Overload_Singnatures {
    public static void main(String[] args) {
        int number1=5;
        int number2=10;
        int number3=20;
        int result=Sum(number1,number2);
        System.out.println("The result is:"+result);

        int result2=Sum(number1,number2,number3);
        System.out.println("The result2 is:"+result2);

        String n1="158";
        String n2="125";
        int result3=Sum(n1,n2);
        System.out.println("The result3 is:"+result3);
    }
    private static int Sum(int n1,int n2){
        return n1+n2;
    }
    private static int Sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    private static int Sum(String number1,String number2){
        int v1=Integer.parseInt(number1);
        int v2=Integer.parseInt(number2);
        return v1+v2;
    }



}
