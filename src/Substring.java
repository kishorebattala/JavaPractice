import java.util.Scanner;

//.Substring()= A method used to extract the portion of a string .substring(start,end).

public class Substring {
        public static void main(String[] args){
            String email;
            String domain;
            String username;

            Scanner scanner = new Scanner(System.in);

            System.out.println("enter your email ");
            email = scanner.nextLine();

            if (email.contains("@")) {
                email = "broCode123@gmail.com";

                username = email.substring(0, email.indexOf("@"));
                domain = email.substring(email.indexOf("@") + 1);

                System.out.println(username);
                System.out.println(domain);
            } else {
                System.out.println("email contains @ symbol ");

            }
            scanner.close();

        }
    }