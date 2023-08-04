import java.util.Scanner;

public class Work26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ", ");
        }
    }
}
