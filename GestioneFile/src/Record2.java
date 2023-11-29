public class Record2 {
    private String username;
    private String home;
    private Pair coordinates;

    public Record2(String username, String home, Pair coordinates) {
        this.username = username;
        this.home = home;
        this.coordinates = coordinates;
    }

    public String getUsername() {
        return username;
    }

    public String getHome() {
        return home;
    }

    public Pair getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Record2{" +
                "nome='" + username + '\'' +
                ", cognome='" + home + '\'' +
                ", coppia=" + coordinates +
                '}';
    }
}
