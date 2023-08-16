public class Work2 {

    int g2(int n, int a[]) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s += a[i] * a[j];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Work2 f = new Work2();

        int[] a = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        System.out.println(f.g2(10, a));
    }
}
