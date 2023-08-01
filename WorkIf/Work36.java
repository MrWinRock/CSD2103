import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        input.close();
        
        Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = vowelPattern.matcher(text);

        if (matcher.find()) {
            System.out.println("There is a vowel");
        } else {
            System.out.println("There is no vowel");
        }
    }
    
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     String text = input.next();
    //     input.close();

    //     for (int i = 0; i < text.length(); i++) {
    //         if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
    //                 || text.charAt(i) == 'u') {
    //             System.out.println("There is  vowel");
    //         } else {
    //             System.out.println("There is no vowel");
    //         }
    //     }
    // }
}
