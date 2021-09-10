package Trees;

public class GenerateTree 
{
	static int findIndex(int in[],int key)
    {
        int index=0;
        for(int i=0;i<in.length;i++)
        {
            if(in[i]==key)
            {
                index=i;
                break;
            }
        }
        return index;
    }
    static Node generateTree(int in[],int post[],int inStart,int inEnd,int postEnd)
    {
        if(inStart>inEnd)
        {
            return null;
        }
        Node node=new Node(post[postEnd]);
        
        if(inStart==inEnd)
        {
            return node;
        }
        
        int index=findIndex(in,node.data);
        node.right=generateTree(in,post,index+1,inEnd,postEnd-1);
        node.left=generateTree(in,post,inStart,index-1,postEnd-inEnd+index-1);
        
        
        return node;
    }
    Node buildTree(int in[], int post[], int n)
    {
        // Your code here 
        Node node=generateTree(in,post,0,n-1,n-1);
        return node;
    }
}
