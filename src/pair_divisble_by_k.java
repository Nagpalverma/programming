import java.util.*;
public class pair_divisble_by_k {
	
	 public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		    // Write your code here  if it contains both negative and postive
		      
		      int[] arr=new int[k];
		      
		      for(int i=0;i<n;i++)
		      arr[((ar.get(i)%k)+k)%k]++;
		      
		      int ans=0;
		      if(arr[0]>1)ans+=(arr[0]-1)*arr[0]/2;
		      for(int i=1;i<k;i++)
		      {
		          int rest=k-i;
		         if(rest==i)
		        	 ans+=arr[i]*(arr[i]-1)/2;
		         if(i<rest)
		        	 ans+=arr[i]*arr[rest];
		      }
		      return ans;
		      
		  
		    }

	public static void main(String[] args) {
		List<Integer> aa=new LinkedList<>();
		aa.add(-1);
		aa.add(4);
		aa.add(1);
		aa.add(2);
		System.out.println(divisibleSumPairs(4,3,aa));

	}

}
