import java.util.Scanner;

public class Work34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if (number > 0) {
            System.out.println("More then zero");
        } else {
            System.out.println("Less or equal zero");
        }
    }
}
