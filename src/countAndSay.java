import java.util.*;
public class countAndSay {
	
    public static String countAndSay(int n) {
        if(n<=1)
            return "1";
        String get=countAndSay(n-1);
         String ans="";int curr=0,pre=Integer.parseInt(get.substring(0,1)),count=0;
        for(int i=0;i<get.length();i++)
        {
            curr=Integer.parseInt(get.substring(i,i+1));
            if(curr==pre)count++;
                else
                {
                    ans+=Integer.toString(count)+Integer.toString(pre);
                    pre=curr;
                    count=1;
                }
                
        }
        ans+=Integer.toString(count)+Integer.toString(pre);
        return ans;
    }
    public static void main(String[] args)
    {
    	System.out.println(countAndSay(4));
    }

}
