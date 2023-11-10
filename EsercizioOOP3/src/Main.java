public class Main {
    public static void main(String[] args) {
        BarcaAMotore barca = new BarcaAMotore(100, 50, 0.5);
        System.out.println(barca);
        barca.riempi(80);
        System.out.println(barca);
        barca.cambiaVelocita(40);
        System.out.println(barca);
        barca.naviga(0.02);
        System.out.println(barca);
    }
}