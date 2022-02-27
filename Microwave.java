import java.util.Scanner;

/**
* The Microwave program asks the user for a food item,
* asks them for the quantity and displays how long it
* will need to be microwaved for.
*
* @author Layla Michel
* @version 1.0
* @since 2022-02-25
*/

final class Microwave {
    /**
    * Create constant for 60.
    */
    public static final double SIXTY = 60;
    /**
    * Create constant for 45.
    */
    public static final double FOURTY_FIVE = 45;
    /**
    * Create constant for 105.
    */
    public static final double HUNDRED_FIVE = 105;
    /**
    * Create constant for 3.
    */
    public static final double THREE = 3;

    /**
    * Creating private constructor due to
    * public/default constructor error.
    *
    * @throws IllegalStateException if there is an issue
    */
    private Microwave() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Creating main function.
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        final Scanner myObj = new Scanner(System.in);
        double time;

        while (true) {
            // Get food item
            System.out.print("What food will you be "
                + "eating (sub, pizza, soup)? ");
            String userFood = myObj.nextLine();
            // Makes it not case sensitive
            userFood = userFood.toLowerCase();

            // Check if userFood is any of the 3
            if ("sub".equals(userFood)) {
                time = SIXTY;
                break;
            } else if ("pizza".equals(userFood)) {
                time = FOURTY_FIVE;
                break;
            } else if ("soup".equals(userFood)) {
                time = HUNDRED_FIVE;
                break;
            } else {
                // Error message if it's none of the 3
                System.out.print("Please enter one of the three options.\n\n");
            }
        }

        while (true) {
            // Get quantity
            System.out.print("\nHow many will you be eating (1 to 3)? ");
            final String quantity = myObj.nextLine();
            try {
                // Check if quantity is an integer
                final int quantityInt = Integer.parseInt(quantity);

                // Check if quantity is between 1 and 3
                if (quantityInt < 1 || quantityInt > THREE) {
                    System.out.print("Quantity must be between 1 and 3.\n\n");
                } else {
                    if (quantityInt == 2) {
                        // New time based on quantity
                        final double newTime = time * 1.5;
                        // Convert into minutes
                        final double minutes = newTime / SIXTY;
                        // Display how long it needs to microwave for
                        System.out.print("Mircrowave for " + minutes
                            + " minutes.\n");
                    } else if (quantityInt == THREE) {
                        // New time based on quantity
                        final double newTime = time * 2;
                        // Convert into minutes
                        final double minutes = newTime / SIXTY;
                        // Display how long it needs to microwave for
                        System.out.print("Mircrowave for " + minutes
                            + " minutes.\n");
                    } else {
                        // Convert into minutes
                        final double minutes = time / SIXTY;
                        // Display how long it needs to microwave for
                        System.out.print("Mircrowave for " + minutes
                            + " minutes.\n");
                    }
                    break;
                }
            } catch (NumberFormatException ex) {
                // Error message if quantity isn't an integer
                System.out.print("Please enter a valid integer.\n\n");
            }
        }
        myObj.close();
    }
}
