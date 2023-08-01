import java.util.Scanner;

public class Work35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        if (number > 0) {
            System.out.println("> 0");
        } else if (number < 0) {
            System.out.println("< 0 ");
        } else {
            System.out.println("= 0");
        }
    }
}
