/** @author Angus Longmore
 *  @author lngang002@myuct.ac.za
 *  @version 1.0
 *  Based on Hussein Suleman's BTQueue
 *  
 */

 /** An object that creates a virtual queue for level order traversal
  * Similar to a linked list
  * @param <dataType> The data to be stored in this node
  */
public class BTQueue<dataType>
{
   BTQueueNode<dataType> head;
   BTQueueNode<dataType> tail;

   /** Constructs an empty BTQueue object
    * 
    */
   public BTQueue ()
   {
      head = null;
      tail = null;
   }

   /** Returns the current queue head and pops it from the list
    * also checks if the list is empty or not
    * 
    * @return
    */
   public BinaryTreeNode<dataType> getNext ()
   {
      if (head == null)
         return null;

      BTQueueNode<dataType> qnode = head;
      head = head.next; // Uses the BTQueuenode Instance variable: next
      if ( head == null )
         tail = null;
      return qnode.node;
   }

   /** Addes a QueueNode to the Queue
    * if the list is empty, the head and tail are both assigned to the specified node
    * 
    * @param node
    */
   public void enQueue ( BinaryTreeNode<dataType> node )
   {
      if (tail == null)
      {
         tail = new BTQueueNode<dataType> (node, null);
         head = tail;
      }
      else
      {
         tail.next = new BTQueueNode<dataType> (node, null);
         tail = tail.next;
      }
   }
}
