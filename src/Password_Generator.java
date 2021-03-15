import java.util.Random;

public class Password_Generator {
    public static void main(String[] args) {
        char[] characters = {'a','b','g','c','h','y','i','9','5','3','1','8','1'};
        Random passw=new Random(characters.length);
        passw.setSeed(characters[3]);
        String passwd=String.valueOf(passw);
        System.out.println(passwd);


    }
}
