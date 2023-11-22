public enum Moneta {
    CENT_1(0.01, "1 Centesimo"),
    CENT_2(0.02, "2 Centesimi"),
    CENT_5(0.05, "5 Centesimi"),
    CENT_10(0.10, "10 Centesimi"),
    CENT_20(0.20, "20 Centesimi"),
    CENT_50(0.50, "50 Centesimi"),
    EURO_1(1.00, "1 Euro"),
    EURO_2(2.00, "2 Euro");

    private double valore;
    private String nome;

    Moneta(double valore, String nome) {
        this.valore = valore;
        this.nome = nome;
    }

    public double getValore() {
        return valore;
    }

    public String getNome() {
        return nome;
    }
}
