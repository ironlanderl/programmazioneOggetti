package Esercizi;
/*
* Es7 del file
* */

import java.util.Scanner;
public class Esercizio5 {
    public static void main(String[] args) {
        System.out.println("Stringa: ");
        Scanner scan = new Scanner(System.in);
        String stringa = scan.nextLine();
        scan.close();

        String[] sottoStringhe = stringa.split(" ");

        for (String a :
                sottoStringhe) {
            System.out.println(a);
        }
    }
}
