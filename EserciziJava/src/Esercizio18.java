import com.ironlanderl.InputUtils;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.Dataset;

import java.util.Arrays;
import java.util.Random;

public class Esercizio18 {
    public static int LanciaDadi(){
        Random rng = new Random();
        return rng.nextInt(1, 7) + rng.nextInt(1, 7);
    }
    public static void main(String[] args) {
        System.out.println("Inserire quanti lanci fare");
        int nLanci = InputUtils.GetInt();
        int[] risultati = new int[nLanci];
        for (int i = 0; i < nLanci; i++){
            risultati[i] = LanciaDadi();
        }

        System.out.println(Arrays.toString(risultati));

    }
}
