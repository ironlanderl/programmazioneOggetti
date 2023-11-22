import java.util.HashMap;

public class RegistratoreDiCassa {
    private static final int MAX_MONETE = 100;
    Moneta[] monete = new Moneta[MAX_MONETE];

    public void aggiungiMoneta(Moneta moneta) {
        if (getNotNullLenght() < MAX_MONETE) {
            monete[getNotNullLenght()] = moneta;
        }
    }

    public void rimuoviMoneta() {
        monete[getNotNullLenght()] = null;
    }

    private int getNotNullLenght() {
        int i = 0;
        while (monete[i++] != null) {
        }
        i--;
        return i;
    }

    public int getNumMonete() {
        return getNotNullLenght();
    }

    public double getSomma() {
        double somma = 0;
        for (int i = 0; i < getNotNullLenght(); i++) {
            somma += monete[i].getValore();
        }
        return somma;
    }

    public String getInfo(){
        return getSingleValueCount().toString();
    }

    private HashMap<String, Integer> getSingleValueCount() {
        HashMap<String, Integer> tmp = new HashMap<>();
        for (int i = 0; i < getNotNullLenght(); i++) {
            int tmp2 = tmp.get(monete[i].getNome()) == null ? 1 : tmp.get(monete[i].getNome()) + 1;
            tmp.put(monete[i].getNome(), tmp2);
        }
        return tmp;
    }
}
