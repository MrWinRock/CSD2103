import java.util.Scanner;

public class Work44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        }
    }
}
