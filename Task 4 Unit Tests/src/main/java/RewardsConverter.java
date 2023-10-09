import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        double cashValue = -1.00;
        while (cashValue <= 0.00) {
            try {
                System.out.print("Please enter a cash value to convert to airline miles: ");
                cashValue = Double.parseDouble(inputScanner.nextLine());
            } catch (Exception exc) { }
        }

        System.out.println("converting $" + cashValue + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + cashValue + " is worth " + rewardsValue.getMilesValue() + " miles");

        inputScanner.close();
    }
}