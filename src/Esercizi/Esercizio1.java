package Esercizi;

import java.util.Scanner;

/*
 * Pardini Fabrizio
 * Esercizio 1
 * 2023/10/19
 *
 * Programma che legge un intero, stampa in binario, ottale ed esadecimale.
 * Stampa anche il reciproco in floating point
 *
 * Scanner: lettura
 * toBinaryString(): binario
 * tabella di printf
 *
 *  */
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserire un numero intero: ");
        int numero = scan.nextInt();

        scan.close();

        // Binario
        System.out.println(numero + " in binario: " + Integer.toBinaryString(numero));
        // Ottale
        System.out.printf("%d in ottale: %o \n", numero, numero);
        // Esadecimale
        System.out.printf("%d in hex: %h \n", numero, numero);
        // Reciproco
        System.out.printf("Il reciproco di %d è %.2f", numero, (float) 1 / numero);

    }
}
