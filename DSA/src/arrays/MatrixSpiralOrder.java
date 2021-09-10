package arrays;

import java.util.*;
public class MatrixSpiralOrder 
{
	public List<Integer> spiralOrder(int[][] matrix) 
	{
        List<Integer> res=new ArrayList<Integer>();
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        int direction=0;
        int i=0;
        while(top<=bottom && left<=right)
        {
            
            if(direction==0)
            {
                for(i=left;i<=right;i++)
                {
                    res.add(matrix[top][i]);
                }
                top+=1;
            }
            else if(direction==1)
            {
                for(i=top;i<=bottom;i++)
                {
                    res.add(matrix[i][right]);
                }
                right-=1;
            }
            else if(direction==2)
            {
                for(i=right;i>=left;i--)
                {
                    res.add(matrix[bottom][i]);
                }
                bottom-=1;
            }
            else
            {
                for(i=bottom;i>=top;i--)
                {
                    res.add(matrix[i][left]);
                }
                left+=1;
            }
            direction=(direction+1)%4;
        }
        return res;
    }
}
