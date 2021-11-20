package geek_for_geeks;
import java.util.*;
public class smallest_distinct_window {
	
	 public static String findSubString( String str) {
	        
	       boolean[] arr=new boolean[256];
	       int[] arr2=new int[256];
	        int len=str.length(),tabcount=0,count=0,i=0,j=0,ans=0;
	        String s="";
	        for(int k=0;k<len;k++)
	        {
	            char c=str.charAt(k);
	            if(arr[c]==false){tabcount++;
	            arr[c]=true;}
	        }
	        
	        while(true)
	        { boolean f1=true,f2=true;
	        
	            while(count<tabcount && j<len)
	            {
	            char c=str.charAt(j++);
	            if(arr2[c]==0)
	                count++;
	           
	             arr2[c]+=1;
	             
	            f1=false;
	            }
	            //optimizing
	            while(count==tabcount && i<j)
	            {
	                String ans22=str.substring(i,j);
	                if(s.isEmpty()||s.length()>ans22.length())
	                s=ans22;
	                
	                char c=str.charAt(i++);
	                arr2[c]-=1;
	                
	                if(arr2[c]<1)
	                   count--;            
	                f2=false;
	            }
	            
	            if(f1&& f2)
	            break;
	        }
	        return s;
	    }
	 
	 public static void main(String[]  args)
	 {
		 System.out.println(findSubString("CCCCAbaBbCCbb"));
	 }

}
