import java.util.Locale;
import java.util.Scanner;

public class GreetingKata {
public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Write your name please: ");
    String name = scan.next();
    System.out.println(greet(name));
}
    public static String greet (String name){
        if (name.equals(" ")) {
            return "Hello, my friend.";
        } else if (name.equals(name.toUpperCase(Locale.ROOT))) {
            return "HELLO, " + name.toUpperCase(Locale.ROOT);
        }
        return "Hello, " + name;
    }
}
