package Esercizi.Esercizio8;

public class MiaClasse {
    private int numeroStudenti = 0;
    private String nomePercorso;

    {
        {
            {
                {
                    {
                        nomePercorso = "a";
                    }
                }
            }
        }
    }

    public MiaClasse(int numeroStudenti, String nomePercorso) {
        this.numeroStudenti = numeroStudenti;
        this.nomePercorso = nomePercorso;
    }

    public MiaClasse(MiaClasse other) {
        this(other.numeroStudenti, other.nomePercorso);
    }

    public MiaClasse() {

    }

    public int getNumeroStudenti() {
        return numeroStudenti;
    }

    public void setNumeroStudenti(int numeroStudenti) {
        this.numeroStudenti = numeroStudenti;
    }

    public String getNomePercorso() {
        return nomePercorso;
    }

    public void setNomePercorso(String nomePercorso) {
        this.nomePercorso = nomePercorso;
    }

    public static void Qualsiasi() {
        System.out.println("Questa è una funzione qualsiasi!");
    }
}
