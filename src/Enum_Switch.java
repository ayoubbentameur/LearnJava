import java.util.Scanner;

enum food_switch{
    Fastfood,
    ArabicFood,
    Coffee
}
public class Enum_Switch{
    public static void main(String[] args) {
        System.out.println("Welcome To our smart resturant");
        System.out.println("1.Fastfood");
        System.out.println("2.ArabicFood");
        System.out.println("3.Coffee");
        System.out.println("Enter Your Choice[1/2/3]:");

        Scanner obj=new Scanner(System.in);
        int choice=obj.nextInt();
        switch (choice){
            case 1:
                System.out.println("You choice:"+food_switch.Fastfood);
                break;
            case 2:
                System.out.println("You choice :"+food_switch.ArabicFood);
                break;
            case 3:
                System.out.println("YOu choice :"+food_switch.Coffee);
                break;
            default:
                System.out.println("Out of range");

        }



    }
}
