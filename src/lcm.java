import java.util.*;
public class lcm {
	 public static int getTotalX(List<Integer> a, List<Integer> b) {
		    
		    int lcm=a.get(0),n1=a.size(),n2=b.size();
		    int gcd=b.get(0);
		    for(int i=1;i<n1;i++)
		        lcm=lcm(lcm,a.get(i),1);
		    
		    for(int i=1;i<n2;i++)
		        gcd=lcm(gcd,b.get(i),0);
		    
		    int k=1,count=0;
		    while(lcm<=gcd)
		    {
		    	if(gcd%lcm==0)
		    		count++;
		    	k++;
		        lcm*=k;
		        
		        
		    }
		    return count;

		    }
		    public static int lcm(int a,int b ,int type)
		    {
		        int n1=a,n2=b;
		        while(n1%n2!=0)
		        {
		            int r=n1%n2;
		            n1=n2;
		            n2=r;
		        }
		       return (type==1)? ((a*b)/n2): n2;
		    }

		
		    public static void main(String[] afaf)
		    {
		    	LinkedList<Integer> a=new LinkedList<>();
		    	LinkedList<Integer> b=new LinkedList<>();
		    	
		    	a.add(2);
		    	a.add(4);
		    	b.add(16);
		    	b.add(32);
		    	b.add(96);
		    	System.out.println(getTotalX(a,b));

		    
		    }

}
