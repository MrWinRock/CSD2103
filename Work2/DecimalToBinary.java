import java.util.Stack;

public class DecimalToBinary {

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
        System.out.println(decimalToBinary(10));
    }
}