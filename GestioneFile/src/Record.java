public class Record {
    private String user;
    private int commentLenght;
    private double sentiment;
    private double polarity;

    public Record(String a, int b, double c, double d) {
        this.user = a;
        this.commentLenght = b;
        this.sentiment = c;
        this.polarity = d;
    }

    @Override
    public String toString() {
        return "Record{" +
                "user='" + user + '\'' +
                ", commentLenght=" + commentLenght +
                ", sentiment=" + sentiment +
                ", polarity=" + polarity +
                '}';
    }
}
