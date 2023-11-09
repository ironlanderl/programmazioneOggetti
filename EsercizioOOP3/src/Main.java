public class Main {
    public static void main(String[] args) {
        BarcaAMotore barca = new BarcaAMotore(50, 100, 0.50);
        barca.riempi(50);
        barca.cambiaVelocita(67);
        barca.naviga(1);
        System.out.println(barca);
    }
}