import java.util.Scanner;

class Card {
    private int bitValue;

    public Card(int bitValue) {
        this.bitValue = bitValue;
    }

    public int getBitValue() {
        return bitValue;
    }
}

public class MagicNumberCardGame {
    private int userNumber;
    private int numOfBits;
    private Card[] cards;

    public MagicNumberCardGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magic Number Card Game!");
        System.out.print("Please think of a positive integer between 1 and 100: ");
        userNumber = scanner.nextInt();

        // Determine the number of bits required to represent the highest number (100) in the range
        numOfBits = (int) (Math.log(userNumber) / Math.log(2)) + 1;

        // Initialize an array to store the bits of the user's number
        cards = new Card[numOfBits];

        // Set up the deck of cards
        for (int i = 0; i < numOfBits; i++) {
            cards[i] = new Card(0); // Initialize all cards with 0 bit value
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        // Guessing Phase
        for (int i = 0; i < numOfBits; i++) {
            int cardNumber = i + 1;
            System.out.print("Card " + cardNumber + ": Is the bit set to 1? (yes/no) ");
            String response = scanner.next();

            // Convert the response to the corresponding bit value (1 or 0)
            int bitValue = response.equalsIgnoreCase("yes") ? 1 : 0;
            cards[i] = new Card(bitValue);
        }

        // Conversion Phase: Convert binary bits to decimal
        int guessedNumber = 0;
        for (int i = 0; i < numOfBits; i++) {
            guessedNumber += cards[i].getBitValue() * Math.pow(2, numOfBits - 1 - i);
        }

        // End of Game: Display the guessed magic number
        System.out.println("The magic number you were thinking of is: " + guessedNumber);
    }

    public static void main(String[] args) {
        MagicNumberCardGame game = new MagicNumberCardGame();
        game.play();
    }
}
