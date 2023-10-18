import java.util.Scanner;

public class DrlowOlleh {
    private static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int foo = 0, bar = 0;

        boolean var_1;
        Boolean var_2;

        Scanner keyboard = new Scanner(System.in);

        foo = keyboard.nextInt();
        bar = keyboard.nextInt();

        keyboard.close();


        System.out.println(sum(foo, bar));
    }
}