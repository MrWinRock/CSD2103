public class BinaryNumberCards {

    public static void main(String[] args) {
        // Card 1: Represents the most significant bit (2^6)
        System.out.println("Card 1: Numbers from 64 to 100");
        for (int i = 64; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Card 2: Represents the 2^5 bit
        System.out.println("Card 2: Numbers from 32 to 63");
        for (int i = 32; i <= 63; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Card 3: Represents the 2^4 bit
        System.out.println("Card 3: Numbers from 16 to 31");
        for (int i = 16; i <= 31; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Card 4: Represents the 2^3 bit
        System.out.println("Card 4: Numbers from 8 to 15");
        for (int i = 8; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Card 5: Represents the 2^2 bit
        System.out.println("Card 5: Numbers from 4 to 7");
        for (int i = 4; i <= 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Card 6: Represents the 2^1 bit
        System.out.println("Card 6: Numbers from 2 to 3");
        for (int i = 2; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Card 7: Represents the least significant bit (2^0)
        System.out.println("Card 7: Number 1");
        System.out.println("1");
    }
}