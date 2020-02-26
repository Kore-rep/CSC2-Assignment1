// Angus Longmore
// Adapted from Hussein Suleman's Binary Tree
import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class BinarySearchTreeTest
{
      static BinarySearchTree<LSDataPiece> bt;
   public static void main ( String [] args )
   {
      bt = new BinarySearchTree<LSDataPiece> ();
      


      /* test for 3-level tree
      bt.insert (5); 
      bt.insert (1); 
      bt.insert (2); 
      bt.insert (4); 
      bt.insert (7); 
      bt.insert (9); 
      bt.insert (8); 
      bt.insert (3); 
      bt.insert (6); 
      

                   5
            1             7
                2      6     9
                  4        8
                 3
*/                 
      System.out.println ("Inorder : ");
      bt.inOrder ();
      if (args.length == 0) {
            ls.printAllAreas();
      } else {
            String checker = args[0] + "_" + args[1] + "_" + args[2];          
            System.out.println ("Search 2 : ");
            bt.visit((bt.find());
      }
      
/*
      System.out.println ("Delete 2 : ");
      bt.delete (2);
      bt.inOrder ();
      System.out.println ("Delete 7 : ");
      bt.delete (7);
      bt.inOrder ();
      System.out.println ("Delete 5 : ");
      bt.delete (5);
      bt.inOrder ();
      System.out.println ("Delete 3 : ");
      bt.delete (3);
      bt.inOrder ();
      System.out.println ("Delete 10 : ");
      bt.delete (10);
      bt.inOrder ();
*/
   }

   public void processFile(String file) {
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


   
