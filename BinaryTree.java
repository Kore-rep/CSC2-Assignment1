// Adapted from Hussein Suleman's Binary Tree
// Angus Longmore

public class BinaryTree<dataType>
{
   // one instance variable for it's root node
   BinaryTreeNode<dataType> root;

   public BinaryTree ()
   {
      // constructor for an empty tree
      root = null;
   }

   public int getHeight ()
   {
      // helper method for parameterized getHelp() method
      return getHeight (root);
   }
   public int getHeight ( BinaryTreeNode<dataType> node )
   {
      // returns the longest branch of the tree
      if (node == null)
         return -1;
      else
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
   }

   public int getSize ()
   {
      // helper method for parameterized getSize()
      return getSize (root);
   }
   public int getSize ( BinaryTreeNode<dataType> node )
   {
      // returns the number of nodes in the tree
      if (node == null)
         return 0;
      else
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }

   public void visit ( BinaryTreeNode<dataType> node )
   {
      // displays the data stored in a specified node
      System.out.println (node.data);
   }

   public void preOrder ()
   {
      // helper method for parameterized preOrder()
      preOrder (root);
   }
   public void preOrder ( BinaryTreeNode<dataType> node )
   {
      // traverses all nodes starting with specified node
      if (node != null)
      {
         visit (node);
         preOrder (node.getLeft ());
         preOrder (node.getRight ());
      }
   }

   public void postOrder ()
   {
      // helper method for parameterized postOrder()
      postOrder (root);
   }
   public void postOrder ( BinaryTreeNode<dataType> node )
   {
      // traverses all nodes starting with the leftmost, lowest node
      if (node != null)
      {
         postOrder (node.getLeft ());
         postOrder (node.getRight ());
         visit (node);
      }
   }

   public void inOrder ()
   {
      // helper method for parameterized inOrder()
      inOrder (root);
   }
   public void inOrder ( BinaryTreeNode<dataType> node )
   {
      // traverses nodes in order i.e. left bottom, left middle, right bottom etc.
      if (node != null)
      {
         inOrder (node.getLeft ());
         visit (node);
         inOrder (node.getRight ());
      }
   }

   public void levelOrder ()
   {
      if (root == null)
         return;
      BTQueue<dataType> q = new BTQueue<dataType> ();
      q.enQueue (root);
      BinaryTreeNode<dataType> node;
      while ((node = q.getNext ()) != null)
      {
         visit (node);
         if (node.getLeft () != null)
            q.enQueue (node.getLeft ());
         if (node.getRight () != null)
            q.enQueue (node.getRight ());
      }
   }
}
