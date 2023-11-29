import java.util.Random;

enum Direzione {
    NORD(0, 1),
    EST(1, 0),
    SUD(0, -1),
    OVEST(-1, 0);

    private final int xChange;
    private final int yChange;

    Direzione(int x, int y) {
        this.xChange = x;
        this.yChange = y;
    }

    public int getxChange() {
        return xChange;
    }

    public int getyChange() {
        return yChange;
    }

    public Direzione leftDirection() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direzione rightDirection() {
        return values()[(ordinal() + 1) % 4];
    }

    public static Direzione randomDirection(){
        return values()[new Random().nextInt(0,4)];
    }

    @Override
    public String toString() {
        return "Direzione{" +
                "xChange=" + xChange +
                ", yChange=" + yChange +
                ", name='" + name() + '\'' +
                '}';
    }
}
