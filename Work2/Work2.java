import java.util.*;

public class Work2 {

    public static String infixToPostfix(String infix) {
        String postfix = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix += stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "";
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }
        
        return postfix;
    }

    private static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String infix = input.nextLine();
        
        System.out.println(infixToPostfix(infix));
        input.close();
    }    

}