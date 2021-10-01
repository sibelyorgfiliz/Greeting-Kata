import java.util.*;

public class GreetingKata {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String yesNo  = "";
        boolean yesNoFlag=false;
        do {
            System.out.print("Write de name please : ");
            name.add(scan.nextLine());
            do{
                System.out.print("Do you want to write another name? Yes/No : ");
                yesNo= scan.nextLine();
                if (!(yesNo.equalsIgnoreCase("no")||yesNo.equalsIgnoreCase("yes"))) {
                    System.out.println("Please write \"Yes\" or \"No\"");
                    yesNoFlag=false;
                } else if (yesNo.equalsIgnoreCase("no") || yesNo.equalsIgnoreCase("yes")){
                    yesNoFlag = true;
                }
            } while (yesNoFlag = false);
        } while (yesNo.equalsIgnoreCase("yes"));

        //System.out.println(stringnameToArrayname(usersText));
        System.out.println(greet(name));
    }

    public static String greet(List <String> name) {
        String greetingNames = "";
        String UPPERgreetingNames = "";
        Boolean flag_Upper = false;
        Boolean flag_Lower = false;

        if (name.get(0)=="") {
            //System.out.println("Hello, my friend.");
            return "Hello, my friend.";
        }

        for (int i = 0; i <= name.size() - 1; i++) {
            if (name.get(i).equals(name.get(i).toUpperCase())) {
                flag_Upper = true;
                if ((i == name.size() - 1)) {
                    UPPERgreetingNames = UPPERgreetingNames + " " + name.get(i);
                } else if (flag_Lower==true) {
                    UPPERgreetingNames = UPPERgreetingNames  + " "+ name.get(i);
                } else {
                    UPPERgreetingNames = UPPERgreetingNames + " and " + name.get(i);
                }
            } else {
                flag_Lower = true;
                if (!(i == name.size() - 1)) {
                    greetingNames = greetingNames +", "+name.get(i);
                } else if (flag_Upper==true) {
                    greetingNames = greetingNames  + " and "+name.get(i);
                } else if (name.size()==3){
                    greetingNames = greetingNames + ", and " + name.get(i);
                } else if (name.size()==2){
                    greetingNames = greetingNames + " and " + name.get(i);
                } else {
                    greetingNames = greetingNames +", "+name.get(i);
                }
                greetingNames=greetingNames.replace("\"","");
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

        /*public static String stringnameToArrayname (String usersText){
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
         */

    //"greet" method
    //public static String greet(List<String> name  /*String[] name*/) {
        /*String greetingNames = "";
        String UPPERgreetingNames = "";
        Boolean flag_Upper = false;
        Boolean flag_Lower = false;

        if (name.equals("")) {
            //System.out.println("Hello, my friend.");
            return "Hello, my friend.";
        }

        for (int i = 0; i <= name.size() - 1; i++) {
            if (name.get(i).equals(name.get(i).toUpperCase())) {
                flag_Upper = true;
                if (i == name.size() - 1) {
                    UPPERgreetingNames = UPPERgreetingNames + " " + name.get(i);
                } else if (flag_Lower == true) {
                    UPPERgreetingNames = UPPERgreetingNames + " " + name.get(i);
                } else {
                    UPPERgreetingNames = UPPERgreetingNames + " and " + name.get(i);
                }
            } else {
                flag_Lower = true;
                if (i == name.size() - 1) {
                    greetingNames = greetingNames + ", " + name.get(i);
                } else if (flag_Upper == true) {
                    greetingNames = greetingNames + " " + name.get(i);
                } else {
                    greetingNames = greetingNames + " and " + name.get(i);
                }
            }
        }
        //return part
        if (flag_Upper == true && flag_Lower == true) {
            return "Hello" + greetingNames + ". AND HELLO" + UPPERgreetingNames + "!";
        } else if (flag_Upper == false && flag_Lower == true) {
            return "Hello" + greetingNames + ".";
        } else {
            return "HELLO" + UPPERgreetingNames + "!";
        }
    }
         */


