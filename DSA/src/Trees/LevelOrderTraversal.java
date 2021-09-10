package Trees;


import java.util.*;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
    }
}

class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        TreeNode temp=root;
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(temp);
        
        while(!(queue.isEmpty())){
            
            Queue<TreeNode> next = new LinkedList<>();
            List<Integer> level = new ArrayList<>();
            while(!(queue.isEmpty())){
                TreeNode node=queue.remove();
                //System.out.print(node.val+" ");
                if(node!=null){
                    level.add(node.val);
                    next.add(node.left);
                    next.add(node.right);
                }
            }
            queue=next;
            if(!level.isEmpty()){
                res.add(level);
            }
        }
        
        return res;
    }
}

/*
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Example 3:
Input: root = []
Output: []
 */
