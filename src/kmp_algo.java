import java.util.*;
public class kmp_algo {

	public static int[] lps(String s)
	{
		int n=s.length();
		int[] ans=new int[n];

		for(int i=1;i<n;i++)
		{
			int j=ans[i-1];
			while(j>0 && s.charAt(i)!=s.charAt(j))
		      j=ans[j-1];
			if(s.charAt(i)==s.charAt(j))
		           j++;
		           ans[i]=j;
		}
		return ans;
	}
	
	static int postion(String s,String find)
	{
		int[] arr=lps(find);
		int i=0,j=0;
		int n=s.length();
		while(i<n)
		{
			if(s.charAt(i)==find.charAt(j))
			{
				i++;j++;
			}
			else
			{
				if(j!=0)
				j=arr[j-1];
				else 
					i++;
			}
			if(j==find.length())
				return i-j+1;
		}
		return -1;
	}
	
	public static void main(String[] arra)
	{
		for(int i:lps("aabaaav"))
			System.out.print(" "+i);
		
	}
}
