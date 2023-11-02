package Esercizi.EsercizioSemplice1;

public class Registratore {

    /***
     *
     */

    private int numeroVenduti;
    private double totaleVendite;
    private double totaleScontati;
    private final double costoArticolo;
    private final int quantitaIngrosso;
    private final double scontoPercento;

    public Registratore(double costoArticolo, int quantitaIngrosso, double scontoPercento) {
        this.costoArticolo = costoArticolo;
        this.quantitaIngrosso = quantitaIngrosso;
        this.scontoPercento = scontoPercento;
    }

    /***
     * l
     * @param n numero
     */
    public void RegistraVendita(int n) {
        if (n > quantitaIngrosso) {
            double scontoArticolo = costoArticolo - (costoArticolo * scontoPercento / 100.0);
            totaleVendite = n * scontoArticolo;
        } else {
            totaleVendite = n * costoArticolo;
        }

        numeroVenduti += n;
    }

    public void mostraVendite() {
        System.out.println("N." + numeroVenduti + "\n" +
                "Tot: " + totaleVendite + "€\n" +
                "Tot sconto: " + scontoPercento + "€");
    }

    static public void Stato() {
        System.out.println("Gestisco vendite ");
    }
}
