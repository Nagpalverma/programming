package geek_for_geeks;
import java.util.*;
public class sort_0_1_2 {
	/*
	 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
	 */
	
	 public static void sort012(int a[], int n)
	    {
	          int j=0;
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]==0)
	        swap(a,i,j++);
	        
	    }
	    
	    for(int i=j;i<n;i++)
	    {
	        if(a[i]==1)
	        swap(a,i,j++);
	    }
	    
	    
	}
	static void swap(int[] arr,int a ,int b)
	{
	    int temp=arr[a];
	    arr[a]=arr[b];
	    arr[b]=temp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort012(arr,n);
		
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
		
	}

}
