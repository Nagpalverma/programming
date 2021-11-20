package geek_for_geeks;
import java.util.*;

public class kth_largest_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		solve (arr,0,n-1,k);

	}
	static void solve(int[] arr,int low, int high,int k)
	{
		int ans;
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	     for(int i=0;i<k;i++)
	    	 pq.add(arr[i]);
	     for(int i=k;i<=high;i++)
	     {
	    	 if(pq.peek()>arr[i])
	    	 {
	    		 pq.poll();
	    		 pq.add(arr[i]);
	    	 }
	     }
		System.out.println(pq.peek());
	}

}
