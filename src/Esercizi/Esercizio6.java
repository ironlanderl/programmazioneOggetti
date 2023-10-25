/*
* Esercizio XI del file
* */

package Esercizi;
import java.util.Scanner;

public class Esercizio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stringa = "";

        while (stringa.length() < 2){
            System.out.println("Stringa min 2 chars:");
            stringa = scan.nextLine();
        }

        stringa = scambiaCaratteri(stringa);
        System.out.printf(stringa);


    }

    public static String scambiaCaratteri(String vecchia){
        Character primo = vecchia.charAt(0);
        Character ultimo = vecchia.charAt(vecchia.length() - 1);

        String nuova = ultimo + vecchia.substring(1, vecchia.length() - 1) + primo;
        return nuova;
    }


}
