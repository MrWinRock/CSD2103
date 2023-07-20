public class CreateArray2 {
    public static void main(String[] args) {

        int[] array = new int[1000];

        System.out.print("int[] a2 = { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(" };");
    }
}
