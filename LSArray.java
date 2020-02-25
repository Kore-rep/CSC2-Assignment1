import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LSArray {
    String[] dataArray;
    int opCount;
    File inFile;


    public LSArray (String file) throws IOException {
        this.inFile = new File(file);
        int counter = 0;
        dataArray = new String[2976];
        try{ 
            Scanner inScanner = new Scanner(inFile);
            while (inScanner.hasNextLine()) {
                this.dataArray[counter] = inScanner.nextLine();
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Cannot find specified file.");
        }
    }

    public void printAllAreas() {
        for (int i=0; i<2976; i++) {
            System.out.println(this.dataArray[i]);
        }
    }

    public void printArea(String key1, String key2, String key3) {
        String checker = key1 + "_" + key2 + "_" + key3;

        for (int i=0; i<2976; i++) {
            if (this.dataArray[i].contains(checker)) {
                System.out.println(this.dataArray[i]);
                break;
            }
        }
    }
}