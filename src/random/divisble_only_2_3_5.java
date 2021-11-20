package random;
import java.util.*;
public class divisble_only_2_3_5 {
	
	public static boolean solution(int no)
	{
		boolean isdivisble=false;
		if(no==1)return false;
		else if(no==0)return true;
		while(no%2==0)
			no/=2;
		while( no%3==0)
			no/=3;
		while(no%5==0)
			no/=5;
		if(no==1)isdivisble=true;
		
		return isdivisble;
	}
	public static void main(String[] sasa)
	{
		System.out.println(solution(33));
	}
	

}
