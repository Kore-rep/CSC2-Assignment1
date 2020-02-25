import java.io.IOException;

public class LSArrayApp {
    public static void main(String[] args) throws IOException {
        LSArray ls = new LSArray("LSData.txt"); 

        if (args.length == 0) {
            ls.printAllAreas();
        } else {
            ls.printArea(args[0], args[1], args[2]);
        }


        
        
    }
}