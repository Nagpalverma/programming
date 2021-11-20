package dynamic_programming;
import java.util.*;
public class selling_wine {

	/*
	 * given array repersents  price of ith wine, you can sold one wine per one year
	 * wine can be sold from left or right side maximise the profit. 
	 */
	public static void main(String[]  sss)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<100;i++)
		{
			Arrays.fill(dp[i],-1);
		}
		arr1=arr;
		System.out.println(solution(0,n-1));
		
	}
	static int[] arr1;
	static int dp[][]=new int[100][100];

	static int solution(int r,int l)
	{
		if(r>l)return 0;
		int year=arr1.length-(l-r);
		if(dp[r][l]!=-1)
			return dp[r][l];
		int profit1=year*arr1[r]+solution(r+1,l);
		int profit2=year*arr1[l]+solution(r,l-1);
		return dp[r][l]= Math.max(profit1, profit2);
		
		
	}
	
}
