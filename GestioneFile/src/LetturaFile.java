import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LetturaFile {
    public static void main(String[] args) {
        ArrayList<Record2> myRecords = new ArrayList<>();
        try {
            FileInputStream fin = new FileInputStream("input.txt");
            Scanner scan = new Scanner(fin);
            while (scan.hasNextLine()){
                String[] values = scan.nextLine().split(" ");
                myRecords.add(new Record2(
                        values[0],
                        values[1],
                        new Pair(values[2])
                ));
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
            System.exit(1);
        }

        if (!myRecords.isEmpty()){
            for (Record2 r : myRecords)
                System.out.println(r);
        }
    }
}
