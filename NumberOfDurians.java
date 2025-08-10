import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        final double DURIAN_PRICE = 15.75;
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("Each durian cost $" + DURIAN_PRICE);
            System.out.print("How much money do you have? $");
            double money = input.nextDouble();

            int numOfDurians = (int)(money / DURIAN_PRICE);

            System.out.println("The number of durian(s) you can buy is " + numOfDurians);
        }
    }
}
