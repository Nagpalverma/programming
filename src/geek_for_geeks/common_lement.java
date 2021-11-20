package geek_for_geeks;
import java.util.*;
public class common_lement {
	/*
	 * Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C
	 */
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
       ArrayList<Integer> ans=new ArrayList<Integer>();
       HashSet<Integer> store=new HashSet<>();
       HashSet<Integer> store2=new HashSet<>();
      for(int i=0;i<n1;i++)
      store.add(A[i]);
      
      for(int i=0;i<n2;i++)
      if(store.contains(B[i]))
      store2.add(B[i]);
      
      for(int i=0;i<n3;i++)
      if(store2.contains(C[i]) && !ans.contains(C[i]))
      ans.add(C[i]);
      
      
      return ans;
      
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> store2=new HashSet<>();
		for(int i=0;i<10;i++)
		store2.add(i);
		
//		Integer[] arr=new Integer[10];
//		for(int i=0;i<10;i++)
//		arr[i]=null;
//		
//		ArrayList<Integer> al=new ArrayList<>();
//		al.add(null);
//		System.out.println(al.get(0));
//				
//		for(int i:arr)
//			System.out.print(i+" ");
		
		HashMap<Integer,Integer> aaaa=new HashMap<>();
		
		Stack<Integer> kdk=new Stack<>();
		System.out.println(kdk.peek());
		
			
	}

}
