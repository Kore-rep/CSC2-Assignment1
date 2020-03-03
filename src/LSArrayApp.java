/** @author Angus Longmore
 *  @author lngang002@myuct.ac.za
 *  @version 1.0
 *  Based on Hussein Suleman's LSArrayApp
 *  
 */

import java.io.IOException;

/** A driver class for LSArray
 * 
 */
public class LSArrayApp {

    /** Main method that creates LSArray and calls relevant functions
     * 
     * @param args User provided parameters
     * @throws IOException Standard error for file I/O
     */
    public static void main(String[] args) throws IOException {
        try {
            LSArray ls = new LSArray(); 
            if (args.length == 0) {
                ls.processFile("src/LSData.txt", "2976");
                ls.printAllAreas();
                System.out.println("Took: " + ls.opCount + " comparisons");


            }
            if (args.length == 2) {
                ls.processFile(args[0], args[1]);
                ls.findAll(args[0]);
            }

            if (args.length == 3) {
                ls.processFile("src/LSData.txt", "2976");
                ls.printArea(args[0], args[1], args[2]);
                System.out.println("Took: " + ls.opCount + " comparisons");
            }
            
        } catch (IOException e) {
            System.out.println("Cannot find file");
        }          
        
    }
}