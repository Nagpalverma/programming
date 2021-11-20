package geek_for_geeks;
import java.util.*;
public class triplet_sumK {
	
	 public static boolean find3Numbers(int arr[], int n, int X) { 
		    
	       // Your code Here
	       Arrays.sort(arr);
	       for(int i=0;i<n-2;i++)
	       if(two_pointer(arr,i+1,X-arr[i]))return true;
	       return false;
	    
	    }
	    
	    public static boolean two_pointer(int[] arr,int i,int k)
	    {
	        int h=arr.length-1;
	        while(i<h)
	        {
	            if(arr[i]+arr[h]>k) h--;
	            else if(arr[i]+arr[h]<k) i++;
	            else return true;
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,5,78,0,6,4};
		System.out.println(find3Numbers(arr,6,10));
		

	}

}
