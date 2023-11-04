import Destiny.*;

public class Main {
    public static Inventario inv = new Inventario();
    public static void main(String[] args) {
        Arma a = new Arma("Sunshot", 100, 50, 10, 20, 40, 10, 15);
        Arma b = new Arma("Ager's Scepter", 50, 90, 55, 10, 50, 20, 60);
        Arma c = new Arma("Trinity Ghoul", 70, 60, 85, 75, 20, 5, 6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        inv.addArma(a);
        inv.addArma(b);
        inv.addArma(c);

        inv.addArma(new Arma("Presa-a-Male Mk.28", 80, 29, 16, 20, 9, 55, 6));
        inv.addArma(new Arma("Quercia Inflessibile", 80, 17, 14, 18, 27, 55, 5));

        inv.plotAvg();
    }
}