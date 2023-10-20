package Esercizi;

import java.util.Scanner;

/*
 * Pardini Fabrizio
 * Esercizio 2
 * 2023/10/19
 *
 * Scrivere un programma che legge un angolo intero (positivi o negativi) e lo normalizza tra 0 e 359 gradi
 *
 * */
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserire un angolo: ");
        int angolo = scan.nextInt();
        int angoloNormalizzato = Math.floorMod(angolo, 360);
        System.out.println("Angolo normalizzato: " + angoloNormalizzato);
        scan.close();
    }

}
