public class Esercizio8 {
    public static void main(String[] args) {
        String a = "Hello World!";
        String b = "Hello World";
        b += "!";
        /* Questo funziona perchè se le due stringe sono uguali dall'inizializzazione, java le
        * considera come lo stesso oggetto. Inizializzandole in questo modo sono considerate
        * diverse e distinte. */
        System.out.println(a.equals(b)); // True
        System.out.println(a == b); // False


    }

}
