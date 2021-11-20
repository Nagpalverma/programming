package geek_for_geeks;
import java.util.*;
public class permutaion_upto_n_if_reption_allowed {
	
	public static void solution(String s,String sub,int i,int k)
	{
		if(i==k)
		{
			System.out.print(" "+sub);
			return;
		}
		for(int j=0;j<s.length();j++)
			solution(s,sub+s.substring(j,j+1),i+1,k);
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
solution("abcd","",0,2);

HashSet<Integer> aa=new HashSet<>();
System.out.println(aa.contains(9));
	}

}
