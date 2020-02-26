import java.io.IOException;

public class LSArrayApp {
    public static void main(String[] args) throws IOException {
        try {
            LSArray ls = new LSArray("src/LSData.txt"); 
            if (args.length == 0) {
                ls.printAllAreas();
            } else {
                ls.printArea(args[0], args[1], args[2]);
            }
            System.out.println("Took: " + ls.opCount + " comparisons");
        } catch (IOException e) {
            System.out.println("Cannot find file");
        }    


        
        
    }
}