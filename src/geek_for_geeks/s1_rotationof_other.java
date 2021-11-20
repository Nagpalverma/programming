package geek_for_geeks;
import java.util.*;
public class s1_rotationof_other {

	static boolean isRotation(String s1,String s2)
	{
//		
//		int i1=s1.indexOf(s2.charAt(0)),i2=0;
//		int len=s2.length();
//		while(i2<len)
//		{
//			if(s1.charAt(i1)!=s2.charAt(i2))
//			return false;
//			if(i1==len-1)
//				i1=0;
//			else
//			i1++;
//			i2++;
//		}
//		
//		return true;
		
		return (s1.length()==s2.length() && (s1+s1).indexOf(s2)!=-1);
	}
	public static void main(String[] args) {
		System.out.println(isRotation("d","d"));
		

	}

}
