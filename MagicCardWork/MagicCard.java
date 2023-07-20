import java.util.*;

public class MagicCard {

    public static void TaiJai(String binaryNumber) {
        int n = binaryNumber.length();
        Character binary[] = new Character[n];
        int cards[] = new int[7];
        String temp = "";

        for (int i = 0; i < binaryNumber.length(); i++) {
            binary[i] = binaryNumber.charAt(i);
            System.out.println(binary[i]);
        }

        // Character cards1[0] = binary[0];

        // for (int i = 0; i < 7; i++) {
        //     if (binary[i] == 0)
        // }
    }

    public static String decimalToBinary(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            int remainder = n % 2;
            stack.push(remainder);
            n /= 2;
        }

        String binaryNumber = "";
        while (!stack.isEmpty()) {
            binaryNumber += String.valueOf(stack.pop());
        }

        return binaryNumber;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i +" "+decimalToBinary(i));

        }
        // TaiJai(decimalToBinary(69));
    }
}
