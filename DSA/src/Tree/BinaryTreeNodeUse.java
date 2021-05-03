
package Tree;

import java.util.Scanner;
public class BinaryTreeNodeUse {
    BinaryTreeNode root;
    
    public BinaryTreeNodeUse(){
        root = null;
    }
    
    
    public void printTree(BinaryTreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
        
        
        
    }
    
    public static void main(String args[]){
        BinaryTreeNodeUse tree = new BinaryTreeNodeUse();
        tree.root = new BinaryTreeNode(10);
        tree.root.left = new BinaryTreeNode(7);
        tree.root.right = new BinaryTreeNode(14);
        tree.root.left = new BinaryTreeNode(6);
       tree.root.right = new BinaryTreeNode(8);
        tree.printTree(tree.root);
       
        
      
    }
    
}
