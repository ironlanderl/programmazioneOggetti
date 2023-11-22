import java.util.Random;

public class NastyRobot extends Robot {
    private final double p = new Random().nextDouble();
    private final int k = new Random().nextInt(2, 11);
    private int k_effettuati = 0;

    @Override
    public String toString() {
        return "NastyRobot{" +
                "p=" + p +
                ", k=" + k +
                ", k_effettuati=" + k_effettuati +
                ", name='" + getName() + '\'' +
                ", posizione=" + getPosizione() +
                ", direzione=" + getDirezione() +
                '}';
    }

    public double getP() {
        return p;
    }

    public int getK() {
        return k;
    }

    public int getK_effettuati() {
        return k_effettuati;
    }

    @Override
    public void move() {
        posizione.translate(direzione.getxChange(), direzione.getyChange());
        if (new Random().nextDouble() < p) {
            posizione.translate(direzione.getxChange(), direzione.getyChange());
        }
        k_effettuati++;
        if (k_effettuati >= k) {
            k_effettuati = 0;
            direzione = Direzione.randomDirection();
        }
    }
}
