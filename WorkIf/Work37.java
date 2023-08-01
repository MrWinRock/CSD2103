import java.util.Scanner;

public class Work37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = input.next();
        input.close();

        if (c == "A") {
            System.out.println("[80, 100]");
        } else if (c == "B") {
            System.out.println("[70, 80]");
        } else if (c == "C") {
            System.out.println("[60, 70]");
        } else if (c == "D") {
            System.out.println("[50, 60]");
        } else if (c == "F") {
            System.out.println("[0, 50]");
        }
    }
}
