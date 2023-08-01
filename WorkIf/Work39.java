import java.util.Scanner;

public class Work39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        input.close();

        if (number < 0) {
            System.out.println("Please insert the number that is greater than zero");
        } else if (number >= 80) {
            System.out.println("A");
        } else if (number >= 70) {
            System.out.println("B");
        } else if (number >= 60) {
            System.out.println("C");
        } else if (number >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
