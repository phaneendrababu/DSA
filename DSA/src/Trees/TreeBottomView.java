package Trees;

import java.util.*;

/*class Node
{
	int data;
	int hd;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

public class TreeBottomView {
	
	static void fetchBottomElements(Node node,int level,int distance,TreeMap<Integer,Node> map)
    {
        if(node==null)
        {
            return;
        }
        if(!(map.containsKey(distance)))
        {
            Node newNode=new Node(node.data);
            newNode.hd=level;
            map.put(distance,newNode);
        }
        else if(map.get(distance).hd<=level)
        {
            Node newNode=map.get(distance);
            newNode.data=node.data;
            newNode.hd=level;
            map.put(distance,newNode);
            
        }
        fetchBottomElements(node.left,level+1,distance-1,map);
        fetchBottomElements(node.right,level+1,distance+1,map);
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        TreeMap<Integer,Node> map= new TreeMap<Integer,Node>();
        fetchBottomElements(root,0,0,map);
        
         for(Map.Entry<Integer,Node> entry : map.entrySet())
         {
             list.add(entry.getValue().data);
         }
        return list;
    }

}
