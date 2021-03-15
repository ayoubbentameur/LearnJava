import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        try {
            URL url=new URL("www.google.com");
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
    }

