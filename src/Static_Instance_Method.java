import java.util.Scanner;

public class Static_Instance_Method {
    public static void main(String[] args) {
//
//        //to call the instance method we need to create an object
//        Ayoub IntanceCall=new Ayoub();
//        //then we call it
//        IntanceCall.Instance_Method();

        //to call the static method we don't need to create an object just call it
        Ayoub.Static_Method();


    }
}

class Ayoub{

    //This is an Instance Method
//    public void Instance_Method(){
//
//        Scanner obj=new Scanner(System.in);
//        System.out.println("Enter The First Number:");
//        int number1=obj.nextInt();
//
//        Scanner obj2=new Scanner(System.in);
//        System.out.println("Enter The Second Number:");
//        int number2=obj2.nextInt();
//        int result=number1+number2;
//        System.out.println("The sum is :"+result);
//    }

        //This is a Static Method
        public static void Static_Method(){
            Scanner obj=new Scanner(System.in);
              System.out.println("Enter The First Number:");
            int number1=obj.nextInt();

        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter The Second Number:");
        int number2=obj2.nextInt();
        int result=number1+number2;
         System.out.println("The sum is :"+result);
        }

}
