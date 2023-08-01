import java.util.Scanner;

public class Work43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baht = input.nextDouble();
        input.close();

        double profit = 0;

        if (baht > 0) {
            baht /= 32.8;
            profit = baht * 0.3;
            System.out.println("THB to USD: " + baht + "\nBank profit: " + profit);
        } else {
            System.out.println("You don't have \"money!\"");
        }
    }
}
