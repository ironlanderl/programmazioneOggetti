public enum Direzione {
    NORD,
    EST,
    SUD,
    OVEST;

    @Override
    public String toString() {
        return "Direzione{" +
                "name='" + name() + '\'' +
                ", ordinal=" + ordinal() +
                ", declaringClass=" + getDeclaringClass() +
                ", describeConstable=" + describeConstable() +
                '}';
    }

    Direzione() {
    }
}
