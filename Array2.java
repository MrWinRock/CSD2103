import java.util.Arrays;

public class Array2 {

    public static void findNumber(int[] a1, int[] a2) {
        try {
            // for (int i = 0; i < a2.length; i++) {
            //     if (a1[i] != a2[i]) {
            //         System.out.println("Array fake index " + i);
            //         a2 = removeTheElement(a2, i);
            //     }
            // }
            System.out.println("Original Array: ");
            for (int i = 0; i < a1.length; i++) {
                System.out.print(a1[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < a2.length; i++) {
                System.out.print(a2[i] + " ");
            }
            System.out.println("\n----------------");

            int arrayMisIndex = Arrays.mismatch(a1, a2);
            a2 = removeTheElement(a2, arrayMisIndex);

            for (int i = 0; i < a2.length; i++) {
                System.out.print(a1[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < a2.length; i++) {
                System.out.print(a2[i] + " ");
            }
            
            
        } catch (Exception e) {
            System.out.println("lol");
        }
    }

    public static int[] removeTheElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }
            newArray[k++] = arr[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] a1 = { 1, 3, 4, 6, 7, 8, 9, 20 };
        int[] a2 = { 1, 3, 4, 6, 7, 0, 8, 9, 20 };

        findNumber(a1, a2);
    }
}
