import java.util.Scanner;

public class BinaryNumberGuess {

    public static int guessNumberInBinary(int n, int length) {
        StringBuilder guess = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int left = n;
            int right = n;
            while (left <= right) {
                int mid = (left + right) / 2;
                System.out.print("Is the " + (i + 1) + "-th digit in group " + "? (Y/N): ");
                Scanner scanner = new Scanner(System.in);
                String response = scanner.nextLine().trim().toLowerCase();
                if (response.equals("y")) {
                    guess.append("1");
                    n = mid;
                    break;
                } else if (response.equals("n")) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (left > right) {
                guess.append("0");
            }
        }

        return binaryToDecimal(guess.toString());
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = length - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, length - 1 - i);
        }

        return decimal;
    }

    public static void main(String[] args) {
        int n = 0;
        int length = 7;
        int guessedNumber = guessNumberInBinary(n, length);
        System.out.println("Guessed binary number: " + guessedNumber);
    }
}