import java.util.Scanner;

public class Work46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        input.close();

        if (a + b > 0) {
            System.out.println("a + b > 0");
        } else if (a + b < 0) {
            System.out.println("a + b < 0");
        } else {
            System.out.println("a + b = 0");
        }
    }
}
