public class Equality_String {
    public static void main(String[] args) {

        String name="Ayoub";
        String name1="Ayoub";
        String name2=new String("Ayoub");
        String name3=new String("Ayoub");

        System.out.println("Primitive==Primitive");

        if (name==name1){
            System.out.println("They Match");
        }else {
            System.out.println("No Match");
        }

        System.out.println("Primitive==Object");

        if (name1==name2) {
            System.out.println("They Match");
            }else {
            System.out.println("No Match");
        }

        System.out.println("Object==Object");

        if (name2==name3){
             System.out.println("They Match");
         }else {
             System.out.println("No Match");
         }

            System.out.println(".equals() Method");
        if (name2.equals(name3)){
            System.out.println("They Match");

        }else {
            System.out.println("No Match");
        }
    }
}