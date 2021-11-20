package geek_for_geeks;
import java.util.*;
public class chnaging_a_to_b {
//no of bits is to changed if a is changed to   b
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		//xor is odd one detector and taking xor and countig set bits we know that  how bits are different in a and b
		//
		/*
		 * 
		 */
		
		int res=k^n;
		int count=0;
		while(res>0)
		{
			res=res&(res-1);
			count++;
		}
		System.out.println(count);
		
		

	}

}
