import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
            op_choice.choice();
    }
}
class operators{
    public static void add(){
        System.out.println("Enter the first number:");
        Scanner no1obj=new Scanner(System.in);
        Double no1=no1obj.nextDouble();

        System.out.println("Enter the second number:");
        Scanner no2obj=new Scanner(System.in);
        Double no2=no2obj.nextDouble();

        double result=no1+no2;
        System.out.println("The result is :"+result);

    }
    public static void sub(){
        System.out.println("Enter the first number:");
        Scanner no1obj=new Scanner(System.in);
        Double no1=no1obj.nextDouble();

        System.out.println("Enter the second number:");
        Scanner no2obj=new Scanner(System.in);
        Double no2=no2obj.nextDouble();

        double result=no1-no2;
        System.out.println("The result is :"+result);

    }
    public static void multi(){
        System.out.println("Enter the first number:");
        Scanner no1obj=new Scanner(System.in);
        Double no1=no1obj.nextDouble();

        System.out.println("Enter the second number:");
        Scanner no2obj=new Scanner(System.in);
        Double no2=no2obj.nextDouble();

        double result=no1*no2;
        System.out.println("The result is :"+result);
    }
    public static void div(){
        System.out.println("Enter the first number:");
        Scanner no1obj=new Scanner(System.in);
        Double no1=no1obj.nextDouble();

        System.out.println("Enter the second number:");
        Scanner no2obj=new Scanner(System.in);
        Double no2=no2obj.nextDouble();

        double result=no1/no2;
        System.out.println("The result is :"+result);
    }
}
class op_choice{
    public static void choice(){
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Hello,Enter your operator please:");

        Scanner chobj=new Scanner(System.in);
        int ch=chobj.nextInt();
        switch (ch){
            case 1:
                operators.add();
                break;
            case 2:
                operators.sub();
                break;
            case 3:
                operators.multi();
                break;
            case 4:
                operators.div();
                break;
            default:
                System.out.println("Wrong input try again please...");

        }
    }
}

