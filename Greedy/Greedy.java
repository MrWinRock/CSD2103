import java.util.*;

class Greedy {

    static void findOrderMRT(int[] L,
            int n) {

        Arrays.sort(L);

        System.out.print("Optimal order in which " +
                "programs are to be stored is: ");
        for (int i = 0; i < n; i++)
            System.out.print(L[i] + " ");
        System.out.println();

        double MRT = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++)
                sum += L[j];
            MRT += sum;
        }
        MRT /= n;
        System.out.print("Minimum Retrieval Time" +
                " of this order is " + MRT);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lenght of Tape: ");
        int n = input.nextInt();
        int[] L = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Tape " + (i+1) + ": ");
            L[i] = input.nextInt();
        }
        
        findOrderMRT(L, n);
        input.close();
    }
}
