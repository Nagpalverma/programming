package geek_for_geeks;

import java.util.*;

public class pair_sum_equal_k {
/*
 * Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.
 */
	static    int getPairsCount(int[] arr, int n, int k) {
	        Map<Integer,Integer> table=new HashMap<>();
	        for(int i=0;i<n;i++)
	        	table.put(arr[i],table.getOrDefault(arr[i], 0)+1);
	           int count=0;
	           for(int i=0;i<n;i++)
	           {
	        	   int x=k-arr[i];
	               if(table.containsKey(x))
	               count+=table.get(x);
	               
	               if(arr[i]==x)
	               count--;
	               
	               
	           }
	           return count/2;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> aa=new HashMap<>();
		
		

	}

}
