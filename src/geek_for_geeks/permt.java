package geek_for_geeks;
import java.util.*;
public class permt {

    public static int evenSubarray(List<Integer> num, int k) {
    // Write your code here
    
    int n=num.size();
    if(n<1)return 0;
    int count=0;
    HashSet<Integer> aa=new HashSet<>();
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            if(find(num,i,j,k,aa))count++;
        }
    }
return count;
    }
    public static boolean find(List<Integer> num, int lo,int hi,int k,HashSet<Integer> aa)
    {
    	
        int co=0;
        String s="";
        for(int i=lo;i<=hi;i++)
        {
        	s+=Integer.toString(num.get(i));
        }
        
        int kk=Integer.parseInt(s);
        if(aa.contains(kk))return false;
        aa.add(kk);
        for(int i=lo;i<=hi;i++)
        {
            if(num.get(i)%2!=0)co++;
            if(co>k)return false;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,2,1,3};
		List<Integer> aa=new LinkedList<>();
		aa.add(2);
		aa.add(1);
		aa.add(2);
		aa.add(1);
		aa.add(3);
//		int t=97;
//		int p= 97==97? 1:   0;
		
		System.out.println(evenSubarray(aa,2));

	}

}
