import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Scans the cost of meal.
            double mealCost = Double.parseDouble(scanner.nextLine());

            // Scans the tip percentage.
            int tipPercent = Integer.parseInt(scanner.nextLine());

            // Scans the tax percentage.
            int taxPercent = Integer.parseInt(scanner.nextLine());

            // Prints the total cost.
            Result.solve(mealCost, tipPercent, taxPercent);

            // Closes the scanner.
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Error occurred while parsing.");
        }
    }
}

class Result {

    /**
     * Calculates the total meal cost.
     *
     * @param mealCost   is the cost of only the meal.
     * @param tipPercent is the percentage of tip given.
     * @param taxPercent is the percentage of tax set on the meal.
     */
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        // Calculating the total meal cost.
        mealCost += (tipPercent * mealCost) / 100 + (taxPercent * mealCost) / 100;
        System.out.println(Math.round(mealCost));
    }
}
