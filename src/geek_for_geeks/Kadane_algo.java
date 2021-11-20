package geek_for_geeks;
import java.util.*;
public class Kadane_algo {
	/*
	 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
	 */
	static int solve(int[] arr,int n)
	{
		int maxsum=Integer.MIN_VALUE,currsum=0;
		for(int i=0;i<n;i++)
		{
			currsum+=arr[i];
			if(currsum>maxsum)
				maxsum=currsum;
			if(currsum<0)
				currsum=0;
		}
		return maxsum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
