public class BarcaAMotore {
    private final double capienzaTotale;
    private final double velocitaMassima;
    private final double efficienza;
    private double capienzaAttuale;
    private double velocitaCorrente;
    private double distanzaPercorsa;

    public BarcaAMotore(double capienzaTotale, double velocitaMassima, double efficienza) {
        this.capienzaTotale = capienzaTotale;
        this.velocitaMassima = velocitaMassima;
        this.efficienza = efficienza;
        this.velocitaCorrente = 0;
        this.distanzaPercorsa = 0;
        this.capienzaAttuale = 0;
    }

    public double getCapienzaAttuale() {
        return capienzaAttuale;
    }

    public double getDistanzaPercorsa() {
        return distanzaPercorsa;
    }

    @Override
    public String toString() {
        return "BarcaAMotore{" +
                "capienzaTotale=" + capienzaTotale +
                ", velocitaMassima=" + velocitaMassima +
                ", efficienza=" + efficienza +
                ", capienzaAttuale=" + capienzaAttuale +
                ", velocitaCorrente=" + velocitaCorrente +
                ", distanzaPercorsa=" + distanzaPercorsa +
                '}';
    }

    public void cambiaVelocita(double nuova) {
        if (velocitaMassima < nuova) {
            System.out.println("no vel");
        } else {
            this.velocitaCorrente = nuova;
        }
    }

    public void naviga(double tempo) {
        double carburanteUsato = efficienza * Math.pow(velocitaCorrente, 2) * tempo;
        if (carburanteUsato <= capienzaAttuale) {
            distanzaPercorsa += velocitaCorrente * tempo;
            capienzaAttuale -= carburanteUsato;
        }
        else{
            System.out.println("no naviga");
        }
    }

    public void riempi(double quantita) {
        if (capienzaAttuale + quantita > capienzaTotale) {
            System.out.println("no riempi");
        } else {
            capienzaAttuale += quantita;
        }
    }
}
