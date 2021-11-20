package geek_for_geeks;
import java.util.*;

import org.w3c.dom.Node;
public class max_to_leaf {

	public static void main(String[] args) {
		ArrayList<Integer> aa=new ArrayList<>();
		aa.add(5);
		aa.add(9);
		
		int[] in= {2,6,9};
		int[][] q=new int[9][];
		
		int[] arr1= {1,2,1,3,5};
		int[] arr2=Arrays.copyOf(arr1, arr1.length);
		System.out.println(arr1+" "+ arr2);
		Arrays.sort(arr1);
		
	
		
		
		
		
//	 LinkedList<Integer> aaaa=new LinkedList<>();
//	 aaaa.getLast();
	 
		
		for(int i:aa.toArray(new Integer[aa.size()]))
			  System.out.println(i);
		

	}
	static int mx=0;
	static void  solution(Node root,int no)
	{
//		if(root ==null)return ;
//		no=no*10+root.data;
//		solution(root.left,no);
//		solution(root.right,no);
//		if(no>mx)mx=no;
//		
	}

}
