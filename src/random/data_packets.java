package random;
import java.util.*;
public class data_packets {
/*
 * no bits are given first 8 bit represent the key,next 8 bits represent the length of msg
 * lengthb is counted from 3 byte ignoring first two byte decode the msg ,each 8 bit represent 
 * the ascii value.
 * 
// */
  public static String solution(String s)
	{
	  int length=Integer.parseInt(s.substring(8,16),2);
		if(length<1)return "";
		StringBuilder ss=new StringBuilder();
		for(int i=16;i<s.length()-1;i+=8)
			ss.append((char)Integer.parseInt(s.substring(i,i+8),2));
		return ss.toString();
	}
	public static void main(String[] args)
	{
//		String s="00001000";
//		String no=Integer.toBinaryString(5);
//		int num=Integer.parseInt(s,2);
//		System.out.println(Character.isDigit('5'));	
//		System.out.println(no+" "+num+" "+Integer.parseInt(Character.toString('8'))+" "+(int)'0');
		
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(solution(s));
	}
}
