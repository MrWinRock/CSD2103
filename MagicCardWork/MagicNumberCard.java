import java.util.Scanner;

public class MagicNumberCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magic Number Card Game!");
        System.out.print("Please think of a positive integer between 1 and 100: ");
        int userNumber = scanner.nextInt();

        // Determine the number of bits required to represent the highest number (100) in the range
        int numOfBits = (int) (Math.log(userNumber) / Math.log(2)) + 1;

        // Initialize an array to store the bits of the user's number
        int[] bits = new int[numOfBits];

        // Guessing Phase
        for (int i = 0; i < numOfBits; i++) {
            int cardNumber = i + 1;
            System.out.print("Card " + cardNumber + ": Is the bit set to 1? (yes/no) ");
            String response = scanner.next();

            // Convert the response to the corresponding bit value (1 or 0)
            bits[i] = response.equalsIgnoreCase("yes") ? 1 : 0;
        }

        // Conversion Phase: Convert binary bits to decimal
        int guessedNumber = 0;
        for (int i = 0; i < numOfBits; i++) {
            guessedNumber += bits[i] * Math.pow(2, numOfBits - 1 - i);
        }

        // End of Game: Display the guessed magic number
        System.out.println("The magic number you were thinking of is: " + guessedNumber);

        scanner.close();
    }
}
