import java.util.Scanner;

public class Work28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }

        System.out.println(sum);
    }   
}
