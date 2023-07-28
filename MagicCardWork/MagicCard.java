// import java.util.*;

import java.util.Scanner;

public class MagicCard {

    public static void displayCardNumber() {

        int[][] cardNumber = new int[7][100];
        for (int i = 7; i < 0; i--) {
            for (int j = 0; j < 100; j++) {
                String temp = decimalToBinary(j);
                System.out.println(temp);
                if (temp.charAt(i) == 1) {
                    cardNumber[i][j] = binaryToDecimal(temp);
                }
            }
        }

        // int cardIterator = 1;
        // for (int[] index : cardNumber) {
        // System.out.println("Card " + cardIterator);
        // cardIterator++;
        // for (int numbers : index) {
        // System.out.println(numbers + " ");
        // }
        // }
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal & 1);
            decimal >>= 1;
        }
        return binary.reverse().toString();
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

    public static int guessNumberInBinary(int n, int length) {
        StringBuilder guess = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int left = n;
            int right = n;
            while (left <= right) {
                int mid = (left + right) / 2;
                System.out.print("Is the " + (i + 1) + "-th digit in group " + "? (Y/N): ");
                try {

                    Scanner input = new Scanner(System.in);
                    String response = input.nextLine().trim().toLowerCase();
                    if (response.equals("y")) {
                        guess.append("1");
                        n = mid;
                        break;
                    } else if (response.equals("n")) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (left > right) {
                guess.append("0");
            }
        }

        return binaryToDecimal(guess.toString());
    }

    public static void main(String[] args) {
        displayCardNumber();

        int n = 0;
        int length = 7;
        int guessedNumber = guessNumberInBinary(n, length);
        System.out.println("Guessed binary number: " + guessedNumber);
    }
}
