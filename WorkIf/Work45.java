import java.util.Scanner;

public class Work45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if ((Math.pow(number, 0.5) % 1) == 0) {
            System.out.println("Yes, It's integer");
        } else {
            System.out.println("No, It isn't integer");
        }
    }
}
