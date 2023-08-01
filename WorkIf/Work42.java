import java.util.Scanner;

public class Work42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float usd = input.nextFloat();
        input.close();

        if (usd > 0) {
            System.out.println(usd * 32.5);
        } else {
            System.out.println("You don't have money");
        }
    }
}
