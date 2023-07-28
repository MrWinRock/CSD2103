public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal & 1);
            decimal >>= 1;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(69));
    }
}
