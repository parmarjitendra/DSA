
package Tree;

public class BinarySearchTree {
    private BinaryTreeNode root;
    
    
    
    private void printTree(BinaryTreeNode root)
    { if (root== null) {
        return;
    }
    String toBePrinted = root.data + "";
    if (root.left != null)
    { 
        toBePrinted += "L:" + root.left.data + ",";
    }

    if (root.right != null) {

        toBePrinted += "R:" + root.right.data;
    }
    System.out.println(toBePrinted);

    printTree(root.left);
    printTree(root.right);

}
    public void printTree(){
    printTree(root);
    }
    private BinaryTreeNode InsertDataHelper(int data,BinaryTreeNode root){
        if(root == null){
            BinaryTreeNode newNode = new BinaryTreeNode(data);
            return newNode;
        }
        if(root.data >data){
            root.left = InsertDataHelper(data,root.left);
        }
        else
        {
            root.right = InsertDataHelper(data,root.right);

        }
        return root;
    }
    public void InsertData(int data){
        root = InsertDataHelper(data,root);
        
    }
    
    private BinaryTreeNode DeleteDataHelper(int data , BinaryTreeNode root){
        if(root == null){
            return null;
        }
        if(data <root.data){
            root.left = DeleteDataHelper(data,root.left);
            return root;
        }
        else if(data > root.data){
            root.right = DeleteDataHelper(data,root.right);
            return root;
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                BinaryTreeNode minNode = root.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = DeleteDataHelper(minNode.data,root.right);
                return root;
            }
        }
    }
    public void DeleteData(int data){
        root = DeleteDataHelper(data,root);
    }
    private boolean HasDataHelper(int data,BinaryTreeNode root){
        if(root == null){
            return false;
        }
        if (root.data == data){
           return true; 
        }
        else if(data > root.data){
        return HasDataHelper(data,root.right);
    }
        else{
            return HasDataHelper(data,root.left);
        }
    }
    public boolean hasData(int data){
        return HasDataHelper(data,root);
    }

    public static void main(String args[]){
    BinarySearchTree bst = new BinarySearchTree();
      bst.InsertData(10);
      bst.InsertData(20);
      bst.InsertData(5);
      bst.InsertData(15);
      bst.InsertData(3);
      bst.InsertData(7);
      bst.printTree();
      bst.DeleteData(10);
      bst.printTree();
       
    }
}
     
