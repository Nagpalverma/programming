package random;

import java.util.*;

public class merge_sort {

	public static int sort(int[] arr,int s,int e)
	{
		if(e-s<=0)return 0;
		int mid=s+(e-s)/2;
		int x=sort(arr,s,mid)+
		sort(arr,mid+1,e);
		if(arr[mid]<arr[mid+1])return x;
		return x+ merge(arr,s,mid+1,e);
	}
	
	public static int merge(int[] arr,int s,int mid,int e)
	{
		int i=0,k=s,j=0,sum=0;
		int[] left=Arrays.copyOfRange(arr,s,mid);
		int[] right=Arrays.copyOfRange(arr,mid,e+1);
		int l1=left.length,r1=right.length;
		while(k<=e)
		{
			while(i<l1 && j<r1)
			{
				if(left[i]<right[j])arr[k++]=left[i++];
				else 
					{arr[k++]=right[j++];
					sum+=mid-s-i;
					}
			}
			
			if(j>=r1)arr[k++]=left[i++];
			else if(i>=l1)arr[k++]=right[j++];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
	System.out.println(sort(arr,0,arr.length-1));
		for(int i:arr)
			System.out.print(i+" ");
		
		String s="ini";
	Scanner sc=new Scanner(System.in);

	}

}