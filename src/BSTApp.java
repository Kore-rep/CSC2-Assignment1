import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class BSTApp {

    private static BinarySearchTree<LSDataPiece> bt;

    public static void main(String[] args) {
        bt = new BinarySearchTree<LSDataPiece> ();
        try {
            processFile("LSData.txt");
        } catch (IOException e) {
            System.out.println("Cannot find txt file");

        }
        if (args.length == 0) {
            bt.inOrder();
        } else {
            String checker = args[0] + "_" + args[1] + "_" + args[2];          
            System.out.println ("Search : ");
            bt.visit((bt.find(new LSDataPiece(checker))));
        }
    }

    public static void processFile(String file) throws IOException {
        File inFile = new File(file);
        try{ 
            Scanner inScanner = new Scanner(inFile);
            while (inScanner.hasNextLine()) {
                bt.insert(new LSDataPiece(inScanner.nextLine()));
            }
        } catch (IOException e) {
            System.out.println("Cannot find specified file.");
        }
        

    }
}