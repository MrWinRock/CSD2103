import java.util.Scanner;

public class Work27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
