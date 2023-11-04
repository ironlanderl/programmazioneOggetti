package Destiny;
public class Inventario {
    Arma[] armi = new Arma[100];

    private int getNotNullLenght(Arma[] array){
        int i = 0;
        while(armi[i++] != null){}
        i--;
        return i;
    }

    public void addArma(Arma arma){
        int i = getNotNullLenght(armi);
        armi[i] = arma;
    }

    public void plotAvg(){
        int mediaImpatto = 0;
        int mediaGittata = 0;
        int mediaStabilita = 0;
        int mediaManeggevolezza = 0;
        int mediaVelRicarica = 0;
        int mediaProiettiliMinuto = 0;
        int mediaCapienza = 0;
        for (int i = 0; i < getNotNullLenght(armi); i++){
            mediaImpatto += armi[i].getImpatto();
            mediaGittata += armi[i].getGittata();
            mediaStabilita += armi[i].getStabilita();
            mediaManeggevolezza += armi[i].getManeggevolezza();
            mediaVelRicarica += armi[i].getVelRicarica();
            mediaProiettiliMinuto += armi[i].getProiettiliMinuto();
            mediaCapienza += armi[i].getCapienza();
        }
        mediaImpatto = ((mediaImpatto / (getNotNullLenght(armi))) / 2) + 1;
        mediaGittata = ((mediaGittata / (getNotNullLenght(armi))) / 2) + 1;
        mediaStabilita = ((mediaStabilita / (getNotNullLenght(armi))) / 2) + 1;
        mediaManeggevolezza = ((mediaManeggevolezza / (getNotNullLenght(armi))) / 2) + 1;
        mediaVelRicarica = ((mediaVelRicarica / (getNotNullLenght(armi))) / 2) + 1;
        mediaProiettiliMinuto = ((mediaProiettiliMinuto / (getNotNullLenght(armi))) / 2) + 1;
        mediaCapienza = ((mediaCapienza / (getNotNullLenght(armi))) / 2) + 1;
        System.out.println("0    10   20   30   40   50" +
                "   60   70   80   90   100");
        System.out.println("|    |    |    |    |    |" +
                "    |    |    |    |    |");
        /*for (int i : new int[]{0, 10,20,30,40,50,60,70,80,90,100}) {
            System.out.println(" ".repeat(i));
        }*/
        System.out.println("*".repeat(mediaImpatto) + " Impatto");
        System.out.println("*".repeat(mediaGittata) + " Gittata");
        System.out.println("*".repeat(mediaStabilita) + " Stabilità");
        System.out.println("*".repeat(mediaManeggevolezza) + " Maneggevolezza");
        System.out.println("*".repeat(mediaVelRicarica) + " Velocità di ricarica");
        System.out.println("*".repeat(mediaProiettiliMinuto) + " Proiettili al minuto");
        System.out.println("*".repeat(mediaCapienza) + " Capienza");
    }

}
