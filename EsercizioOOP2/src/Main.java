public class Main {
    public static void main(String[] args) {
        IndirizzoPersona p1 = new IndirizzoPersona("Luigi", "Verdi", "verdi.luigi@gmail.com", "+39 978 420 1578");
        IndirizzoPersona p2 = new IndirizzoPersona("Mario", "Rossi", "rossi.mario@gmail.com", "+39 975 458 1579");
        IndirizzoPersona p3 = new IndirizzoPersona("Luigi", "Blu", "blu.luigi@gmail.com", "+39 978 420 7846");

        System.out.println("---------------------Dati Originali------------------------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.setMail("verdi.luigi@hotmail.com");
        p2.setNumeroTelefono("+1 929 556 2746");
        p3.setMail("blu.luigi@proton.me");

        System.out.println("---------------------Dati Modificati-----------------------");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("---------------------Uguaglianza p1 con p1, p2 e p3--------");
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}