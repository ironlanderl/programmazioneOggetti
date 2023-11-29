import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Sim {
    private final ArrayList<Robot> robots = new ArrayList<Robot>();
    private final ArrayList<NastyRobot> nastyRobots = new ArrayList<NastyRobot>();

    public Sim() {
        for (int i = 0; i < 50; i++) {
            robots.add(new Robot());
            nastyRobots.add(new NastyRobot());
        }
    }

    private void executeSingleRobot(Robot e) {
        if (new Random().nextInt(0, 2) == 0) {
            e.turnLeft();
        } else {
            e.turnRight();
        }
        e.move();
    }

    private void step() {
        for (Robot r :
                robots) {
            executeSingleRobot(r);
        }
        for (NastyRobot r :
                nastyRobots) {
            executeSingleRobot(r);
        }
    }

    public void simulate() {
        for (int i = 0; i < 1000; i++) {
            step();
            if (i % 100 == 0 && i != 0) {
                controlloDirezione();
                controlloDistanza();
                controlloOverlap();
                // System.exit(0);
                System.out.println("Eseguiti 100 step! i = " + i);
            }
        }
    }

    private void controlloOverlap() {
        ArrayList<Robot> tot = new ArrayList<>();
        tot.addAll(robots);
        tot.addAll(nastyRobots);

        for (Robot r : tot) {
            for (Robot t : tot) {
                if (r.equals(t)) {
                    break;
                }
                if (r.getPosizione().equals(t.getPosizione())) {
                    System.out.println(r.getName() + " e " + t.getName() + " hanno la stessa posizione: " + r.getPosizione().toString());
                }
            }
        }
    }

    private void controlloDistanza() {
        Robot distante = robots.get(0);
        for (Robot r :
                robots) {
            if (distante.getDistanza(new Point(0, 0)) < r.getDistanza(new Point(0, 0))) {
                distante = r;
            }
        }
        for (NastyRobot r :
                nastyRobots) {
            if (distante.getDistanza(new Point(0, 0)) < r.getDistanza(new Point(0, 0))) {
                distante = r;
            }
        }
        System.out.println("Robot più distante: " + distante.getName() + " ||| Distanza: " + distante.getDistanza(new Point()));
    }

    private void controlloDirezione() {
        int[] direzioni = new int[4];
        for (Robot r :
                robots) {
            direzioni[r.direzione.ordinal()]++;
        }
        for (NastyRobot r :
                nastyRobots) {
            direzioni[r.direzione.ordinal()]++;
        }
        System.out.println("N: " + direzioni[0] + " E: " + direzioni[1] + " S: " + direzioni[2] + " W: " + direzioni[3]);
    }

}
