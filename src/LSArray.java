import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* An Array Class
*/
public class LSArray {
    LSDataPiece[] dataArray;
    int opCount;
    File inFile;


    public LSArray (String file) throws IOException {
        this.inFile = new File(file);
        int counter = 0;
        dataArray = new LSDataPiece[2976];
        try{ 
            Scanner inScanner = new Scanner(inFile);
            while (inScanner.hasNextLine()) {
                this.dataArray[counter] = new LSDataPiece(inScanner.nextLine());
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Cannot find specified file text file.");
        }
    }

    public void printAllAreas() {
        for (int i=0; i<2976; i++) {
            System.out.println(this.dataArray[i].getSource());
        }
    }

    public void printArea(String key1, String key2, String key3) {
        String checker = key1 + "_" + key2 + "_" + key3;
        
        for (int i=0; i<2976; i++) {
            opCount++;
            if (this.dataArray[i].getKey().equals(checker)) {
                System.out.println("Stage/Day/Time combo " + this.dataArray[i].getKey() + " yielded Areas:\n" );
                System.out.println(this.dataArray[i].getAreas());
                break;
            }
        }
    }
}