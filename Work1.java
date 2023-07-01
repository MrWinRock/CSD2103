import java.util.Random;
import java.util.Scanner;

class Work1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int userInput = input.nextInt();

            if (userInput > randomNumber) {
                System.out.println("Too high, try again");
            } else if (userInput < randomNumber) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Your answer is correct");
                return;
            }
        }

        System.out.println("Out of attempts");
    }
}