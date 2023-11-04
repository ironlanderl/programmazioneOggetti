public class IndirizzoPersona {
    private final String nome;
    private final String cognome;
    private String mail;
    private String numeroTelefono;

    public IndirizzoPersona(String nome, String cognome, String mail, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(obj instanceof IndirizzoPersona altra)) {
            return false;
        }

        return this.nome.equals(altra.nome);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
