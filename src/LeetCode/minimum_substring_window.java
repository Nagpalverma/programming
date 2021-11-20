package LeetCode;
import java.util.*;
public class minimum_substring_window {
	
	  public static  String minWindow(String s, String t) {
	        
	        
	        Map<Character,Integer> t2=new HashMap<>();
	        Map<Character,Integer> s2=new HashMap<>();
	        for(int i=0;i<t.length();i++)
	        {char c=t.charAt(i);
	           t2.put(c,t2.getOrDefault(c,0)+1);
	                  }
	        int i=-1,j=-1,precount=0,exactcount=t.length();
	        String ans="";
	        while(true)
	        {
	            boolean f1=false,f2=false;
	            while(i<s.length()-1&&precount<exactcount)
	            {
	                char c=s.charAt(++i);
	               
	                if(s2.getOrDefault(c,0)<t2.getOrDefault(c,0))precount++;
	                s2.put(c,s2.getOrDefault(c,0)+1);
	                
	                f1=true;
	            }
	            while(j<i && precount==exactcount)
	            {
	                String sub=s.substring(j+1,i+1);
	                if(ans.isEmpty() || sub.length()<ans.length())
	                    ans=sub;
	                j++;
	                char c=s.charAt(j);
	                s2.put(c,s2.getOrDefault(c,0)-1);
	                if(s2.getOrDefault(c,0)<t2.getOrDefault(c,0))precount--;
	                
	                f2=true;
	            }
	            if(!f1&&!f2)
	                break;
	            
	        }
	        return ans;
	    }
	  public static void main(String[] sasas)
	  {
		  String s="avaabanma";
		  String t="abam";
		  System.out.println(minWindow(s,t));
				  
	  }

}
