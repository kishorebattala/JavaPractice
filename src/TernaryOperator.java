import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){

        //Ternary Operator

        //int number = 64 ;
        //String marks = (number>65)? "pass" : "Fail";
        //System.out.println(marks);

        double temp;
        double newTemp;
        String unit;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the temp ");
        temp = scanner.nextDouble();

        System.out.println("convert into celsius  or fahrenheit (C or F) ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp-32)*5/9 : (temp * 5/9)+32;

        System.out.printf("the Temp is %.2f %s " , newTemp , unit);


        scanner.close();
    }

}
