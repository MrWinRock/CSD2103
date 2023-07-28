import java.util.Scanner;

public class Test {

    // public static int findCardNumber(int number) {

    // int cardNumber = 1;

    // while (Math.pow(2, cardNumber) - 1 < number) {
    // cardNumber++;
    // }

    // return cardNumber;
    // }

    // public static String[] createArrays(int number) {
    //     String binaryNumber = decimalToBinary(number);
    //     int size = binaryNumber.length();

    //     String[] array = new String[size];

    //     for (int i = 0; i < size; i++) {
    //         char c = binaryNumber.charAt(i);

    //         array[i] = Character.toString(c);
    //     }

    //     for (String index : array) {
    //         System.out.print(index + " ");
    //     }

    //     return array;
    // }

    // public static String[][] createArrays(int number) {
    //     int size = decimalToBinary(number).length();
    //     String binaryNumber = decimalToBinary(number);

    //     String[][] array = new String[size][];
        
    //     for (int i = 0; i < size; i++) {
    //         while (binaryNumber)
    //         char c = binaryNumber.charAt(i);
    //         array[i][] = Character.toString(c);
    //     }

    //     return array;
    // }

    public static void displayCard(int number) {
        int size = number;
        int[][] cardArray = new int[number][];


        for (int i = 0; i < size; i++) {

        }
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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        // createArrays(number);
        // System.out.println(findCardNumber(number));
    }

}
