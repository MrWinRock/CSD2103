import java.util.Stack;

public class Test {
    public static int precedence(char operator) {
        switch (operator) {
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
                    System.out.println("Invalid Expression");
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

    public static String infixToPrefix(String infix) {
        StringBuilder reversedInfix = new StringBuilder(infix).reverse();
        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);
            if (c == '(') {
                reversedInfix.setCharAt(i, ')');
            } else if (c == ')') {
                reversedInfix.setCharAt(i, '(');
            }
        }

        String postfix = infixToPostfix(reversedInfix.toString());
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void display(String infix) {
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + infixToPostfix(infix));
        System.out.println("Prefix: " + infixToPrefix(infix));
        System.out.println("-------------------------------");
    }


    public static void main(String[] args) {
        display("D-B+C");
        display("A*B+C*D");
        display("(A+B)*(C-D)");
        display("(A+B)*C-D*F+C");
        display("(A-2*(B+C)-D*E)*F");
        display("(A*B)-(C/D*E)^F");
        display("A^B*C-D+E/F/(G+H)");
        display("((A+B)*C-(D-E))^(F+G)");
    }
}
