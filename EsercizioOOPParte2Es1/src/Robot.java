import java.awt.*;
import java.util.UUID;

public class Robot implements Motion {
    protected Point posizione = new Point(0, 0);
    protected Direzione direzione = Direzione.NORD;
    protected String name = UUID.randomUUID().toString();

    public Robot() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Robot robot = (Robot) o;

        return getName().equals(robot.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    public Robot(Point p, Direzione d) {
        posizione = p;
        direzione = d;
    }

    public Robot(int x, int y, Direzione d) {
        posizione.move(x, y);
        direzione = d;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "posizione=" + posizione +
                ", direzione=" + direzione +
                ", name='" + name + '\'' +
                '}';
    }

    public double getDistanza(Point da){
        return Point.distance(da.x, da.y, posizione.x, posizione.y);
    }

    public Point getPosizione() {
        return posizione;
    }

    public Direzione getDirezione() {
        return direzione;
    }

    public void turnLeft() {
        direzione = direzione.leftDirection();
    }

    public void turnRight() {
        direzione = direzione.rightDirection();
    }

    public void move() {
        posizione.translate(direzione.getxChange(), direzione.getyChange());
    }

}
