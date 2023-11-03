package Esercizi;

public class Esercizio3 {
    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    public static void main(String[] args) {
        final int nmax = 6;

        int[][] odds = new int[nmax + 1][];
        for (int i = 0; i <= nmax; i++)
            odds[i] = new int[i + 1];

        for (int i = 0; i < odds.length; i++)
            for (int j = 0; j < odds[i].length; j++) {
                int lodds = 1;
                for (int k = 1; k <= j; k++)
                    lodds = lodds * (i - k + 1) / k;
                odds[i][j] = lodds;
            }

        for (int[] row : odds) {
            for (int odd : row)
                System.out.print(odd + "\t");
            System.out.println();
        }


    }
}
