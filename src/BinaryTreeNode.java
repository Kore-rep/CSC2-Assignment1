// Adapted from Hussein Suleman's Binary Tree
// Angus Longmore

public class BinaryTreeNode<dataType>
{

   // create Node with variables for it's data, and child nodes
   dataType data;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;

   public BinaryTreeNode ( dataType d, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      // constructor for a node, with given data, and child nodes
      data = d;
      left = l;
      right = r;
   }

   BinaryTreeNode<dataType> getLeft () {
     // returns left child node
     return left; }

   BinaryTreeNode<dataType> getRight () {
     // returns right child node
     return right; }
}
