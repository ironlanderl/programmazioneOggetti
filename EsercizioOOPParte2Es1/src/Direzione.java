enum Direzione {
    NORD(xChange = 0, yChange = 1),
    EST(xChange = 1, yChange = 0),
    SUD(xChange = 0, yChange = -1),
    OVEST(xChange = -1, yChange = 0);

    private static int xChange = 0;
    private static int yChange = 0;

    Direzione(int x, int y) {
        xChange = x;
        yChange = y;
    }

    public Direzione leftDirection() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direzione rightDirection() {
        return values()[(ordinal() + 1) % 4];
    }

    @Override
    public String toString() {
        return "Direzione{" +
                "xChange=" + xChange +
                ", yChange=" + yChange +
                '}';
    }
}
