package random;
import java.util.*;
public class squre_and_sort {
	/*
	 * given sorted array (contains negative and postive no)
	 * your task is square each element and sort them.
	 * in O(n)
	 */
	
	static int[] solution(int[] arr)
	{
		int size=arr.length,j=size-1,k=0,index=j;
		if(size<1)return null;
		int[] ans=new int[size];
		for(int i=0;i<size;i++)
		arr[i]*=arr[i];
		while(k<=j)
		{
			if(arr[j]<arr[k])ans[index--]=arr[k++];
			else ans[index--]=arr[j--];
		}
		return ans;
	}
	static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String ayud[])
	{
		int[] arr= {-4,-3,-2,0,1,2};
		
		
	
		
		
		for(int i:solution(arr))
			System.out.print(" "+i);
	}

}
