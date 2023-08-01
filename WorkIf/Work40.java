import java.util.Scanner;

public class Work40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();

        if (year >= 0) {
            System.out.println(year += 543);
        } else {
            System.out.println("Please insert number that is greater or equal to zero");
        }
    }
}
