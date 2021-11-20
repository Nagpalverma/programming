package geek_for_geeks;

import java.util.*;
public class rotate_array_by_1_place {
	/*
	 * Given an array, rotate the array by one position in clock-wise direction.
	 */
	  
    public static void rotate(int arr[], int n)
    {
        for(int i=n-2;i>=0;i--)
        swap(arr,i,i+1);
    }
    static void  swap(int arr[], int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.MIN_VALUE;

	}

}
