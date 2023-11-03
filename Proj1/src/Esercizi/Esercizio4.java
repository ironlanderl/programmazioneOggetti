package Esercizi;

import java.util.Scanner;
/*
 * Numero maggiore tra 3
 *
 * */

public class Esercizio4 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserire tre numeri");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();

        if (a == b && b == c){
            System.out.println("Uguali");
            System.exit(0);
        }

        if (a < b) {
            if (b < c) {
                System.out.println("c maggiore");
            }
            else {
                System.out.println("b maggiore");
            }
        } else {
            if (a < c) {
                System.out.println("c maggiore");
            }
            else {
                System.out.println("a maggiore");
            }
        }


    }
}

