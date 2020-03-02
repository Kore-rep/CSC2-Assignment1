/** @author Angus Longmore
 *  @author lngang002@myuct.ac.za
 *  @version 1.0
 *  Based on Hussein Suleman's BTQueueNode
 *  
 */


/** An extension of a BinaryTreeNode with a next variable
 * 
 * @param <dataType> Generic data type
 */
public class BTQueueNode<dataType>
{
   BinaryTreeNode<dataType> node;
   BTQueueNode<dataType> next;

   /** Creates a new QueueNode with a given node, and its following node
    * 
    * @param n Node to be converted
    * @param nxt Node that follows this one
    */
   public BTQueueNode ( BinaryTreeNode<dataType> n, BTQueueNode<dataType> nxt )
   {
      node = n;
      next = nxt;
   }
}
