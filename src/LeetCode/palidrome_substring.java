package LeetCode;
import java.util.*;
public class palidrome_substring {
	
	public static void main(String[] atta) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(countSubstring(s));
	}
	
	
	  public static int countSubstring(String s) {
	        char[] c=s.toCharArray();
	        int n=c.length;
	        int[][] dp=new int[n][n];	        
	      
	        for(int i=0;i<n;i++)
	        {
	        	dp[i][i]=1;
	        	if(i !=n-1 &&c[i]==c[i+1])dp[i][i+1]=1;
	        }
	        
	        for(int i=0;i<n;i++)
	          	for(int j=i;j<n;j++)
	           		 if(solution(c,i,j,dp))dp[i][j]=1;
	        	
	        	
	        
	        
	        int ans=0;
	        
	        for(int i=0;i<n;i++)
	         for(int k=i;k<n;k++)
	         if(dp[i][k]==1)
	        	ans++;
	        
	        
	     
	        return ans;
	        
	    }
	    
	    public static boolean solution(char[] c,int s,int e,int[][] dp)
	    {
	        
	        if(s>e)return false;
	        if(dp[s][e]==1)return true;
	      
	       if(c[s]==c[e]&&solution(c,s+1,e-1,dp))
	                      return true;
	       return false;                  
	        
	    }

}
