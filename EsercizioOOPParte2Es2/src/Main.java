public class Main {
    public static void main(String[] args) {
        RegistratoreDiCassa reg = new RegistratoreDiCassa();
        reg.aggiungiMoneta(Moneta.EURO_2);
        reg.aggiungiMoneta(Moneta.EURO_2);
        reg.aggiungiMoneta(Moneta.EURO_1);
        reg.aggiungiMoneta(Moneta.CENT_10);
        reg.aggiungiMoneta(Moneta.CENT_10);
        reg.aggiungiMoneta(Moneta.CENT_5);

        System.out.println(reg.getNumMonete());
        System.out.println(reg.getSomma());
        System.out.println(reg.getInfo());

    }
}
