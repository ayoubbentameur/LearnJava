import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
try {
    Div();
}catch (ArithmeticException e){
    System.out.println("Can't divise by 0");
}


    }

    private static void Div() throws ArithmeticException {
        System.out.println("Enter the first number:");
        Scanner obj=new Scanner(System.in);
        int number1= obj.nextInt();

        System.out.println("Enter the second number:");
        Scanner obj2=new Scanner(System.in);
        int number2=obj2.nextInt();

        int div = number1 / number2;
        System.out.println("result:" + div);
    }
}

