public class Work23 {
    public static void main(String[] args) {
        for (int i = -9; i <= 0; i++) {
            int num = (i % 2 == 0) ? i : -i;
            System.out.print(num + ", ");
        }
    }
}
