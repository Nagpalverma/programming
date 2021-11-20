package random;
import java .util.*;
public class password {
	/*
	 * length between 8 -32
	 * atleast 1 small letter
	 * atleast 1 capital letter
	 * 1 number
	 * 1 special letter
	 * no letter should be repeted more than 3 times
	 */
public static boolean solution(String s)
{
	int len=s.length();
	if(len<8 || len>32)return false;
	int arr[]= new int[256];
	boolean issmall=false,iscapital=false,isno=false,isspecial=false;
	for(int i=0;i<len;i++)
	{
		char c=s.charAt(i);
		arr[c]++;
		if(arr[c]>=3)return false;
		
		if(Character.isUpperCase(c))iscapital=true;
		else if(Character.isLowerCase(c))issmall=true;
		else if(Character.isDigit(c))isno=true;
		else isspecial=true;
	}
	if(issmall && iscapital && isno && isspecial)return true;
	return false;
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      System.out.println(solution(s));
	}

}
