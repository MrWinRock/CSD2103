public class Work1 {

    int g1(int n, int a[]) {
        int s = 0, max = a[0], min = a[0];
        
        for (int i = 1; i < n; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
            s += max - min;
        }

        return s;
    }

    public static void main(String[] args) {
        Work1 f = new Work1();

        int[] a = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
        System.out.println(f.g1(10, a));

    }
}