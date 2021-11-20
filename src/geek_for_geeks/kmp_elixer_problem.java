package geek_for_geeks;
import java .util.*;
public class kmp_elixer_problem {

	// 7Octber problem optimise solution
	public static int find(String s,String sub)
	{
		int count=0;
		int n=s.length(),n1=sub.length();
		for(int i=0;i<=n-n1;)
		{
			int k=i,j=0;
			while(j<n1 && s.charAt(i)==sub.charAt(j)) {
				i++;j++;
			}
			if(j==n1)
				count++;
			else 
				i=k+1;
		}
		return count;
	}
	
	public static int[] lps(String s)
	{
		int n=s.length();
		int[] arr=new int[n];
		arr[0]=0;
		for(int i=1;i<n;i++)
		{
			int j=arr[i-1];
			while(j>0 &&s.charAt(i)!=s.charAt(j))
				j=arr[j-1];
			if(s.charAt(i)==s.charAt(j))
				j++;
			arr[i]=j;
		}
		return arr;
	}
	
	public static int solution(String s)
	{
		int[] arr=lps(s);
		int i=s.length();
		if(arr[i-1]<=0)return -1;
		while(i>0 && arr[i-1]>0)
			i=arr[i-1];
		String sub=s.substring(0,i);
		return find(s,sub);
		}
	
	public static void main(String[] ara)
	{
		System.out.println(solution("abab cdk;abab"));
	}
}
