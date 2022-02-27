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
            System.out.print("What food will you be "
                + "eating (sub, pizza, soup)? ");
            String userFood = myObj.nextLine();
            userFood = userFood.toLowerCase();

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
                System.out.print("Please enter one of the three options.\n\n");
            }
        }

        while (true) {
            System.out.print("\nHow many will you be eating (1 to 3)? ");
            final String quantity = myObj.nextLine();
            try {
                final int quantityInt = Integer.parseInt(quantity);

                if (quantityInt < 1 || quantityInt > THREE) {
                    System.out.print("Quantity must be between 1 and 3.\n\n");
                } else {
                    if (quantityInt == 2) {
                        final double newTime = time * 1.5;
                        final double minutes = newTime / SIXTY;
                        System.out.print("Mircrowave for " + minutes
                            + " minutes.\n");
                    } else if (quantityInt == THREE) {
                        final double newTime = time * 2;
                        final double minutes = newTime / SIXTY;
                        System.out.print("Mircrowave for " + minutes
                            + " minutes.\n");
                    } else {
                        final double newTime = time;
                        final double minutes = newTime / SIXTY;
                        System.out.print("Mircrowave for " + minutes
                            + " minutes.\n");
                    }
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.print("Please enter a valid integer.\n\n");
            }
        }
        myObj.close();
    }
}
