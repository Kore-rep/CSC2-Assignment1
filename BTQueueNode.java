// Adapted from Hussein Suleman's Binary Tree
// Angus Longmore

public class BTQueueNode<dataType>
{
   // create a QueueNode with variables for a normal tree node and QueuedNode
   BinaryTreeNode<dataType> node;
   BTQueueNode<dataType> next;

   public BTQueueNode ( BinaryTreeNode<dataType> n, BTQueueNode<dataType> nxt )
   {
      // Create a new QueueNode with a specified node and a node that is next in queue
      node = n;
      next = nxt;
   }
}
