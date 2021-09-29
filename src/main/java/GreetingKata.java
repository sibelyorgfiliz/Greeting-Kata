import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class GreetingKata {

    public static void main(String[] args) {


        String usersText;
        Scanner scan = new Scanner(System.in);
        System.out.print("Write your name please : ");
        usersText = scan.nextLine();
        System.out.println(stringnameToArrayname(usersText));
    }
        public static String stringnameToArrayname (String usersText){
            String[] name;
            if (usersText.isEmpty()) {
                //System.out.println("Hello, my friend.");
                return "Hello, my friend.";
            } else {
                usersText = usersText.replace("\"", " ");
                usersText = usersText.replace(",", " ");
                name = usersText.split(" ");
                //System.out.println(greet(name));
                return greet(name);
            }
        }

    //"greet" method
    public static String greet(String[] name) {
        String greetingNames = "";
        String UPPERgreetingNames = "";
        Boolean flag_Upper = false;
        Boolean flag_Lower = false;

        for (int i = 0; i <= name.length - 1; i++) {
            if (name[i].equals(name[i].toUpperCase())) {
                flag_Upper = true;
                if (i == name.length - 1) {
                    UPPERgreetingNames = UPPERgreetingNames + " " + name[i];
                } else if (flag_Lower==true) {
                    UPPERgreetingNames = UPPERgreetingNames  + " "+ name[i];
                    } else {
                    UPPERgreetingNames = UPPERgreetingNames + " and " + name[i];
                    }
            } else {
                flag_Lower = true;
                if (i == name.length - 1) {
                    greetingNames = greetingNames +", "+name[i];
                } else if (flag_Upper==true) {
                    greetingNames = greetingNames  + " "+name[i];
                    } else {
                    greetingNames = greetingNames + " and " + name[i];
                    }
            }
        }
        //return part
        if (flag_Upper == true && flag_Lower==true) {
            return "Hello"+greetingNames + ". AND HELLO"+UPPERgreetingNames+"!";
        } else if (flag_Upper==false&&flag_Lower==true) {
            return "Hello" + greetingNames+".";
        } else {
            return "HELLO" + UPPERgreetingNames +"!";
        }
    }
}
