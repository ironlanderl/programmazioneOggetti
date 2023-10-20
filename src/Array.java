public class Array {
    public static void main(String[] args) {
        int[] a1 = {4, 5, 6}; // array initializers
        int[] a3 = new int[3]; // array creation expression
        int[] a4 = a1;
        int[] a5;

        for (int i = 0; i < a3.length; i++)
            a3[i] = (i + 1) * 2;

        a4[0] = 42;
        a5 = a4;
        a5[1] = 24;

        for (int i = 0; i < a1.length; i++)
            System.out.println(a1[i]);
    }
}
