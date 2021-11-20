package geek_for_geeks;

import java.util.*;

public class shuffle_string {
	/*
	 * In the above example, we have a string array named results. It contains three
	 * strings: 1XY2, Y1X2, and Y21XX. We are checking if these three strings are
	 * valid shuffle of strings first(XY) and second(12).
	 */
	
	public static boolean isValid(String s1,String s2,String result)
	{
		int len=result.length();
		int l1=s1.length();int l2=s2.length();
		if(l1+l2!=len)return false;
		int[] arr=new int[256];
		int[] res=new int[256];
		
		for(int i=0;i<len;i++)
			res[result.charAt(i)]++;
		for(int i=0;i<l1;i++)
			arr[s1.charAt(i)]++;
		for(int i=0;i<l2;i++)
			arr[s2.charAt(i)]++;
		return Arrays.equals(arr, res);
		
	}
	
	
	public static void main(String[] atat)
	{
	System.out.println(isValid("xyy","153","1x5y3y"));
	
	

	
		
	}
	
}
