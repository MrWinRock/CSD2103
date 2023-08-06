public class Work51 {
    public static void main(String[] args) {
        int count = 0;
        
        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
