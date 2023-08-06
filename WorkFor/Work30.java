import java.util.Scanner;

public class Work30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        double result;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (1.0/(i*i));
        }

        sum *= 6;
        
        result = Math.sqrt(sum);
        System.out.println(result);

    }
}
