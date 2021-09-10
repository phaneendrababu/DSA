package Trees;

class Node{
    int data;
    int hd;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class CheckForBST {

	static boolean checkBST(Node node,int min,int max)
    {
        if(node==null)
        {
            return true;
        }
        if(node.data>=min && node.data<=max)
        {
        	/* Apply recursion*/
            return (checkBST(node.left,min,node.data-1)&&checkBST(node.right,node.data+1,max));
        }
        return false;
    }
    boolean isBST(Node root)
    {
    	/* Intialize min and max with respective values*/
        boolean result=checkBST(root,-999999,999999);
        return result;
    }
}
