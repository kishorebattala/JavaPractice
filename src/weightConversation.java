import java.util.Scanner;
// a simple blueprint for our weight conversation

public class weightConversation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Declare Variables//
        double weight;
        double newWeight;
        int choice;

        System.out.println(" Weight Conversation program "); //welcome message
        System.out.println("1: convert lbs to kgs "); // prompt for user choice//
        System.out.println("2: convert kgs to lbs ");

        System.out.println(" choose an option 1 or 2? ");
        choice = scanner.nextInt();

        if (choice ==1){
            System.out.println("enter the weight in lbs "); // option 1. convert lbs to kgs//
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf(" the new weight in kgs is %.3f ", newWeight);

        } else if (choice ==2) {
            System.out.println("enter the weight in kgs "); // option 2. convert kgs to lbs//
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("the new weight in lbs %.2f ", newWeight);
        }else
            System.out.println("please select one option from top "); // else print not a vaild statement//






        scanner.close();
    }
}
