import java.util.Scanner;

public class Work47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int num1 = input.nextInt();
        System.out.print("b: ");
        int num2 = input.nextInt();
        input.close();

        if ((num1 + num2) == 0) {
            System.out.println("Zero");
        } else if ((num1 + num2) > 0) {
            if ((num1 + num2) % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else if ((num1 + num2) < 0) {
            if ((num1 + num2) % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        }
    }
}
