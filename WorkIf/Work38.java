import java.util.Scanner;

public class Work38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        input.close();

        if (number < 0) {
            System.out.println("Please insert the number that is greater or equal to zero");
        } else if (number <= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
