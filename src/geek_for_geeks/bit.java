package geek_for_geeks;

public class bit {
	
	 static int maxSubstring(String S) {
	        // code here
	        int len=S.length();
	        int k=Integer.parseInt(S,2);
	        int c=0;
	        while(k>0)
	        {
	            c++;
	            k=k&(k-1);
	        }
	        
	        if(len==c)
	        return -1;
	        
	        
	        int z=len-c,  st=-1,no=z;
	        int i=0;
	        for(;i<len && z>0;i++)
	        {
	            if(S.charAt(i)=='0')
	            {z--;
	            if(st==-1)
	            st=i;
	            }
	        }
	          k=Integer.parseInt(S.substring(st,i),2);
	         c=0;
	            while(k>0)
	        {
	            c++;
	            k=k&(k-1);
	        }
	        return no-c;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( maxSubstring("11000100011"));
		

	}

}
