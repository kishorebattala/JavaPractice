import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {

        //Enhanced Switch = A Replacement to many else if Statements. (Java14 feature)
        Scanner scanner = new Scanner(System.in);
        String day;


        System.out.println("enter the day of the week ");
        day = scanner.nextLine();

        switch (day) {
            case "monday", "tuesday", "wednesday" -> System.out.println("2 more days to go ");
            case "thursday" -> System.out.println("1 more day to go ");
            case "friday " -> System.out.println("lets celebrate the party ");
            case "saturday " -> System.out.println("lets have the fun ");
            case "sunday" -> System.out.println("get ready for monday's meeting  ");
            default -> {
                System.out.println("there is no such day with " + day);


                double num;
                char operator;
                double num2;
                double result = 0;

                System.out.println("enter the number ");
                num = scanner.nextDouble();

                System.out.println("enter the operator that you looking for  +,-,/,*  ");
                operator = scanner.next().charAt(0);

                System.out.println("enter the number ");
                num2 = scanner.nextDouble();

                switch (operator) {
                    case '+' -> result = num + num2;
                    case '-' -> result = num - num2;
                    case '/' -> result = num / num2;
                    case '*' -> result = num * num2;
                }
                System.out.printf("the result is %.2f", result);
            }


        }
        scanner.close();


    }
}