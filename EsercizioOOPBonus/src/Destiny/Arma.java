package Destiny;

public class Arma {
    private String nome;
    private int impatto;
    private int gittata;
    private int stabilita;
    private int maneggevolezza;
    private int velRicarica;
    private int proiettiliMinuto;
    private int capienza;

    public Arma(String nome, int impatto, int gittata, int stabilita, int maneggevolezza, int velRicarica, int proiettiliMinuto, int capienza) {
        this.nome = nome;
        this.impatto = impatto;
        this.gittata = gittata;
        this.stabilita = stabilita;
        this.maneggevolezza = maneggevolezza;
        this.velRicarica = velRicarica;
        this.proiettiliMinuto = proiettiliMinuto;
        this.capienza = capienza;
    }

    public int getStabilita() {
        return stabilita;
    }

    @Override
    public String toString() {
        return "Destiny.Arma{" +
                "nome='" + nome + '\'' +
                ", impatto=" + impatto +
                ", gittata=" + gittata +
                ", stabilita=" + stabilita +
                ", maneggevolezza=" + maneggevolezza +
                ", velRicarica=" + velRicarica +
                ", proiettiliSecondo=" + proiettiliMinuto +
                ", capienza=" + capienza +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getImpatto() {
        return impatto;
    }

    public int getGittata() {
        return gittata;
    }

    public int getManeggevolezza() {
        return maneggevolezza;
    }

    public int getVelRicarica() {
        return velRicarica;
    }

    public int getProiettiliMinuto() {
        return proiettiliMinuto;
    }

    public int getCapienza() {
        return capienza;
    }
}
