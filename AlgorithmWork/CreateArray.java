public class CreateArray {

    public static void createArray1(int size) {
        int[] array = new int[size];

        System.out.print("int[] a1 = { ");
        for (int i = 1; i <= array.length; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(" };\n");
    }

    public static void createArray2(int size) {
        int[] array = new int[size];

        System.out.print("int[] a2 = { ");
        for (int i = 1; i <= array.length; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(" };");
    }

    public static void main(String[] args) {
        int size = 2500;
        createArray1(size);
        createArray2(size);
    }
}
