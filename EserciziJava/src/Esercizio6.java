import com.ironlanderl.InputUtils;

import java.math.BigInteger;

public class Esercizio6 {
    public static BigInteger Fattoriale(BigInteger numero){
        if (numero.compareTo(BigInteger.ZERO) > 0){
            return numero.multiply(Fattoriale(numero.subtract(BigInteger.ONE)));
        }
        else {
            return BigInteger.ONE;
        }
    }
    public static void main(String[] args) {
        System.out.println("Inserire un numero intero: ");
        BigInteger number = InputUtils.GetBigInt();
        BigInteger originale = number;
        BigInteger risultato = BigInteger.ONE;

        // Metodo 1
        while (number.compareTo(BigInteger.ZERO) > 0){
            risultato = risultato.multiply(number);
            number = number.subtract(BigInteger.ONE);
        }
        System.out.println(originale + "! = " + risultato);

        // Metodo 2
        System.out.println(originale + "! = " + Fattoriale(originale));

    }
}
