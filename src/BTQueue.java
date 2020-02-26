// Adapted from Hussein Suleman's Binary Tree
// Angus Longmore

public class BTQueue<dataType>
{
   // similar to a linked list
   // A BTQueue Object with variables for it's head node and tail node
   BTQueueNode<dataType> head;
   BTQueueNode<dataType> tail;

   public BTQueue ()
   {
      // construct an empty Queue
      head = null;
      tail = null;
   }

   public BinaryTreeNode<dataType> getNext ()
   {
      // returns the current head and pops it from the list
      // also checks if the list is empty or not
      if (head == null)
         return null;

      BTQueueNode<dataType> qnode = head;
      head = head.next; // Uses the BTQueuenode Instance variable: next
      if ( head == null )
         tail = null;
      return qnode.node;
   }

   public void enQueue ( BinaryTreeNode<dataType> node )
   {
      // Queues a QueueNode
      // If the list is empty, the head and tail are both assigned to the specified node
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
