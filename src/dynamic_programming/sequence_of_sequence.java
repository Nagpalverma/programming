package dynamic_programming;

import java.util.*;

public class sequence_of_sequence {
	/*
	 * given two integers m and n find the number of possible  sequence of length n such that 
	 * each of the next element
	 * is greater than or equal to twice of
	 *the previous element but less than or equal to m.
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		solution(m,n);
		

	}
	static int dp[][];
	static void solution(int m,int n)
	{
		dp=new int[m+1][n+1];
		for(int i=0;i<dp.length;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		
		System.out.print(solve(m,n));
	}
	static int solve(int m,int n)
	{
		if(m<n)
			return 0;
		if(n==0)return 1;
		if(dp[m][n]!=-1)return dp[m][n];
		
//		two cases are poosible
		
		return dp[m][n]=solve(m/2,n-1)+solve(m-1,n);
	}

}
