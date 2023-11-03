public class TestVari {

    public static void test1() {
        int[] a = {0, 1, 1, 2, 3, 5};
        int i = 0;
        while (i < a.length) {
            System.out.print(a[i]);
            System.out.print("\t");
            i++;
        }
    }

    public static void prefix() {
        int x = 4, y = 0;

        while (--x >= 0) {
            System.out.println("x:" + x);
            y += 2;
            System.out.println("y:" + y);
        }
    }

    public static void postfix() {
        int x = 4, y = 0;

        while (x-- >= 0) {
            System.out.println("x:" + x);
            y += 2;
            System.out.println("y:" + y);
        }
    }

    public static void main(String[] args) {
        //test1();
        //test2();
        System.out.println("pre");
        prefix();
        System.out.println("post");
        postfix();
    }
}
