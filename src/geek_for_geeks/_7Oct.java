package geek_for_geeks;
import java.util.*;
public class _7Oct {
	/*
	 * Flamel is making the Elixir of Life but he is missing a secret ingredient, a
	 * set of contiguous plants (substring) from the Garden of Eden. The garden
	 * consists of various plants represented by string S, where each letter
	 * represents a different plant. But the prophecy has predicted that the correct
	 * set of plants required to make the potion will appear in the same contiguous
	 * pattern (substring) at the beginning of the forest (prefix), the end of the
	 * forest (suffix), and will also be the most frequent sequence present in the
	 * entire forest.
	 * 
	 * Identify the substring of plants required to make the elixir and find out the
	 * number of times it appears in the forest.
	 * 
	 * Example 1:
	 * 
	 * Input: S = "ababaaaab" Output: 3 Explanation: Substring "ab" is a prefix, It
	 * is also a suffix and appears 3 times.
	 */
	
	

   static  int maxFrequency(String S)
    {
    	int[] lps=lps(S);
    	int i=S.length();
    	if(lps[i-1]<1)
    	return 0;
    	while(i>0 && lps[i-1]>0)
    	    i=lps[i-1];
    	    
    	    String sub=S.substring(0,i);
    	    int[] lps2=lps(sub);
    int count=0,pos=0,i1=0;
while(pos+sub.length()<S.length())
{
    int j=0;
    for(;i1<S.length();)
    {
        if(S.charAt(i1)==sub.charAt(j))
        {
            i1++;j++;
        }
        else{
            if(j!=0)
            j=lps2[j-1];
            else
            i1++;
        }
        
        if(j==sub.length())
        {
            count++;
            pos=i1-j+1;
            break;
        }
            }	
}   
return count; 	
    }


public static int[] lps(String s)
{
    int[] arr=new int[s.length()];
    arr[0]=0;
    
    for(int i=1;i<s.length();i++)
    {
        int j=arr[i-1];
        while(j>0 && s.charAt(i)!=s.charAt(j))
        j=arr[j-1];
        
        if(s.charAt(i)==s.charAt(j))
        j++;
        arr[i]=j;
    }
    
    return arr;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(maxFrequency("aabcaa"));
		
		HashSet<Integer> d=new HashSet<>();
		d.add(5);
		d.add(6);
		d.add(7);
		Iterator<Integer> i=d.iterator();
		i.next();
		i.remove();
		i.next();
		i.remove();
		
		System.out.println(d);

	}

}
