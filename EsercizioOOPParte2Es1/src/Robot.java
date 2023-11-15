import java.awt.*;

public class Robot {
    private Point posizione = new Point(0, 0);
    private Direzione direzione = Direzione.NORD;

    public Point getPosizione(){
        return posizione;
    }

    public Direzione getDirezione(){
        return direzione;
    }

    public Robot(){

    }

    /*public Robot(Point p, Direzione d){
        posizione = p;
        direzione = d;
    }

    public Robot(int x, int y, Direzione d){
        posizione.move(x,y);
        direzione = d;
    }*/

    public void turnLeft() {
        direzione = direzione.leftDirection();
    }

    @Override
    public String toString() {
        return "Robot{" + "posizione=" + posizione + ", direzione=" + direzione + '}';
    }

    public void turnRight() {
        direzione = direzione.rightDirection();
    }

    public void move() {
        posizione.translate(direzione.getxChange(), direzione.getyChange());
    }

}
