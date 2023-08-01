import java.util.Scanner;

public class Work48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hour: ");
        int hour = input.nextInt();
        System.out.print("Minute: ");
        int min = input.nextInt();
        input.close();

        int price = 0;

        if (hour <= 1) {
            System.out.println("Free");
        } else if (hour > 1) {
            price = (hour - 1) * 30;
            System.out.println(price + " Baht");
        } else if (hour > 1 && min > 0) {
            price = hour * 30;
            System.out.println(price + " Baht");
        }
    }
}
