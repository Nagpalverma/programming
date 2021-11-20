package geek_for_geeks;
import  java.util.*;
public class spiral_matrix {
	  static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int cb)
	    {
	        // code here 
	        ArrayList<Integer> ans=new ArrayList<>();
	        int top=0,bottom=r-1,left=0,right=cb-1,d=0;
	        while(top<=bottom && left<=right)
	        {
	            for(int i=left;i<=right && d==0 ;i++ )
	                    ans.add(matrix[top][i]);
	            
	            top++;
	            d++;
	            
	             for(int i=top;i<=bottom && d==1 && left<=right;i++ )
	                    ans.add(matrix[i][right]);
	            
	            right--;
	            d++;
	            
	             for(int i=right;i>=left && d==2 && top<=bottom;i-- )
	                    ans.add(matrix[bottom][i]);
	            
	            bottom--;
	            d++;
	            
	             for(int i=bottom;i>=top && d==3 && left<=right;i-- )
	                ans.add(matrix[i][left]);
	            left++;
	            d=0;
	            
	        }
	        return ans;
}
	  public static void main(String main[])
	  {
		  int[][] aa= {{6,6, 2,28, 2},{ 12,26 ,3 ,28,7},{22, 25,3 ,4, 23}};
		  ArrayList<Integer> jj= spirallyTraverse(aa, 3,5);
		  System.out.println(jj);
	  }
}
