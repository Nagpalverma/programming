package geek_for_geeks;

import java.util.Arrays;

public class permutation_upto_nth_place {
	
	public static void solution(char[] c,int i,int k)
	{
		
		if(i==k)
		{
			System.out.print(" "+new String(Arrays.copyOfRange(c, 0,k)));
			return ;
		}
		
		for(int j=i;j<c.length;j++)
		{
			swap(c,i,j);
			solution(c,i+1,k);
			swap(c,i,j);
		
		}
	}
	
	  public static void swap(char[] c,int i,int j)
	    {
	        char temp=c[i];
	        c[i]=c[j];
	        c[j]=temp;
	    }
	    
	
	
	public static void main(String[] arrg)
	{
		solution("abcd".toCharArray(),0,2);
	}

}
