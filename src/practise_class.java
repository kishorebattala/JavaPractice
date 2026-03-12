import java.util.Scanner;
public class practise_class {
    public static void main(String[] args){


        //length method..//
        String name = "Password";
        int length;
        char letter;
        int index;
        int lastIndex;

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("a", "k");
        System.out.print(name);

        if (name.equalsIgnoreCase("Password")) {
            System.out.println("your password match with the username please change the password ");
        } else {
            System.out.println("your account has been solved ");
        }
        String email = "amith123@gmail.com ";
        String username = email.substring(0, 8);
        String domainName = email.substring(7, 19);

        System.out.println(domainName);

        int income = 30000;
        double taxRate = (income >= 40000) ? 0.45 : 0.21;
        System.out.println(taxRate);
    }
}