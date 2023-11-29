import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LetturaTastiera {
    public static void main(String[] args) {
        ArrayList<Record> myRecords = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true){
            String tmp = scan.nextLine();
            String[] fields = tmp.split(",");
            if(fields.length != 4){
                break;
            }
            else {
                myRecords.add(new Record(
                        fields[0],
                        Integer.parseInt(fields[1]),
                        Double.parseDouble(fields[2]),
                        Double.parseDouble(fields[3])
                ));
            }
        }

    }
}
