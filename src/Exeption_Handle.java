import java.util.Scanner;

public class Exeption_Handle {
    public static void main(String[] args) {

            System.out.println("Enter the first number:");
       Scanner obj=new Scanner(System.in);
       int number1= obj.nextInt();

       System.out.println("Enter the second number:");
       Scanner obj2=new Scanner(System.in);
       int number2=obj2.nextInt();
            try {
                int div = number1 / number2;
                System.out.println("result:" + div);
            }catch (ArithmeticException div){
                System.out.println("Can't Divise by 0");
            }
    }
}
