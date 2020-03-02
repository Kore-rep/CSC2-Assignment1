/** @author Angus Longmore
 *  @author lngang002@myuct.ac.za
 *  @version 1.0
 *  
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** An enhanced array class
 * 
 */
public class LSArray {
    static LSDataPiece[] dataArray;
    static int opCount = 0;
    static File inFile;

    /** Constructs an empty LSArray object
     * 
     */
    public LSArray() {

    }
    /** Constructs an LSArray object and passes the given file to be processed and added
     * 
     * @param file Specified text file to read from
     * @throws IOException Standard error with file I/O
     */
    public LSArray (String file) throws IOException {
        processFile(file, "2976");
    }

    /** Adds all data from the text file to the array
     * 
     * @param file THe file to be added
     * @throws IOException Standard error for file I/O
     */
    public void processFile(String file, String arraySize) throws IOException {
        inFile = new File(file);
        int counter = 0;
        dataArray = new LSDataPiece[Integer.parseInt(arraySize.trim())];
        try{ 
            Scanner inScanner = new Scanner(inFile);
            while (inScanner.hasNextLine()) {
                dataArray[counter] = new LSDataPiece(inScanner.nextLine());
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Cannot find specified file text file.");
        }
    }

    /** Prints all lines in the array
     * 
     */
    public void printAllAreas() {
        for (int i=0; i<dataArray.length; i++) {
            System.out.println(dataArray[i].getSource());
        }
    }

    /** Searches the array for a specific key and prints corrosponding areas
     * and prints a message if it cannot locate given key
     * @param key1 Stage (User provided)
     * @param key2 Day (User provided)
     * @param key3 Time (User provided)
     */
    public void printArea(String key1, String key2, String key3) {
        String checker = key1 + "_" + key2 + "_" + key3;
        String result = printArea(checker);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Could not find any results for given key");
        }
        
    }

    /** Determines if the array contains a matching key
     * 
     * @param key The key to search for
     * @return The matching data entry if found, null if not
     */
    public static String printArea(String key) {        
        for (int i=0; i<dataArray.length; i++) {
            opCount++;
            if (dataArray[i].getKey().equals(key)) {
                return dataArray[i].getAreas();
            }
        }
        return null;
        

    }

    /** Given a text file, uses each line of the file as a parameter and searches for it
     * outputting comparison operation counts
     * 
     * @param file The file to be used for parameters
     * @throws IOException Standard error for file I/O
     */
    public void findAll(String file) throws IOException {
        Scanner searchScanner = new Scanner(inFile);
        Integer counter = 0;
            while (searchScanner.hasNextLine()) {
                
                if (printArea(new LSDataPiece(searchScanner.nextLine()).getKey()) != null) {
                    System.out.println(opCount);
                    opCount = 0;
                }
            } 

    }
}