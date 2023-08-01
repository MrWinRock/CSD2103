import java.util.Scanner;

public class Work41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temperature = input.nextFloat();
        input.close();

        if (temperature >= 32) {
            System.out.println(5*(temperature - 32) / 9);
        } else {
            System.out.println("Too cold to live");
        }
    }
}
