import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent){
            if (isSenior){
                System.out.println("you are student you get 10% discount");
                System.out.println("you are senior you get 20% discount");
                price *= 0.7;
                System.out.printf("the total price $%.2f",price);
            } else {
                System.out.println("you get a student discount of 10% ");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("for senior you get 20%");
                price *= 0.8;
                System.out.printf("the price for ticket after discount $ %.2f",price);
            } else {
                price *= 1;
                System.out.printf("the total is %.2f", price);
            }
                if (isStudent){
                    System.out.println("you are student you get 10%");
                    price *=0.9;
                } else {
                    price *=1;
                    }




        }
        scanner.close();

    }
}