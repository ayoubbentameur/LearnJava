public class Enum_Loop {
    enum loop{
        Fastfood,
        ArabicFood,
        Coffee
    }

    public static void main(String[] args) {

        for (loop print : loop.values()){
System.out.println(print);
        }

    }
}
