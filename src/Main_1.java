import java.util.Scanner;
public class Main_1 {
    public static void main(String[] args){
        String email;
        String domain;
        String username;

        Scanner scanner = new Scanner(System.in);

        email = "broCode123@gmail.com";
        username=email.substring(0,email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1);


        System.out.println(username);
        //System.out.println(username);
        //System.out.println(domain);

        scanner.close();

    }
}