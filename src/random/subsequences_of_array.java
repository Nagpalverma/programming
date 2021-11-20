package random;
import java.util.*;
public class subsequences_of_array {

	public static void subseq(int[] arr,int i,int n,int[] rec)
	{
		    if(i>=n)
		    	{for(int ii:rec)
		    		if(ii!=0)
		    	System.out.print(" "+ii);
		    	System.out.println();
		    	return;                                                 
		    	}
		    
		   rec[i]=arr[i];
		    subseq(arr,i+1,n,rec);
		    rec[i]=0;
		    subseq(arr,i+1,n,rec);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] c=new char[5];
//		c[1]='a';
//		for(char cc:c)
//			System.out.print(cc+"d");
//		String s=new String(c);
//		s=s.trim();
//		
//		System.out.println(s.length()+" "+s);

		int[] arr= {1,2,3};
		int[] s=new int [3];
		subseq(arr,0,3,s);
		bit(arr);
	}
	
	public static void bit(int[] arr)
	{
		int len=arr.length;
		int no=(int)Math.pow(2, len);
		for(int i=0;i<no;i++)
		{
			String s=Integer.toString(i,2);
			int m=0;
			for(int j=s.length()-1;j>=0;j--)
			{
				if(s.charAt(j)=='1')
					System.out.print(arr[m]+" ");
				m++;
			}
			System.out.println();
		}
		
	}

}
