import java.awt.*;

public class Robot {
    private final Point posizione = new Point(0, 0);
    private Direzione direzione = Direzione.NORD;

    public void turnLeft() {
        switch (direzione) {
            case NORD -> {
                direzione = Direzione.OVEST;
            }
            case EST -> {
                direzione = Direzione.NORD;
            }
            case SUD -> {
                direzione = Direzione.EST;
            }
            case OVEST -> {
                direzione = Direzione.SUD;
            }
        }
    }

    @Override
    public String toString() {
        return "Robot{" + "posizione=" + posizione + ", direzione=" + direzione + '}';
    }

    public void turnRight() {
        switch (direzione) {
            case NORD -> {
                direzione = Direzione.EST;
            }
            case EST -> {
                direzione = Direzione.SUD;
            }
            case SUD -> {
                direzione = Direzione.OVEST;
            }
            case OVEST -> {
                direzione = Direzione.NORD;
            }
        }
    }

    public void move() {
        switch (direzione) {
            case NORD -> {
                posizione.translate(0, 1);
            }
            case EST -> {
                posizione.translate(1, 0);
            }
            case SUD -> {
                posizione.translate(0, -1);
            }
            case OVEST -> {
                posizione.translate(-1, 0);
            }
        }
    }

}
