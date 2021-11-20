package random;

public class reverse_8bit_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		String sn=Integer.toString(n,2);
		int len=sn.length();
		String rs="";
		for(int i=0;i<len;i++)
		{
			if(sn.charAt(i)=='0')
				rs=rs+Character.toString('1');
			else
				rs=rs+Character.toString('0');
		}
		for(int i=0;i<8-len;i++)
			rs=Character.toString('1')+rs;
		int reverse=Integer.parseInt(rs,2);
	System.out.println(reverse+" "+rs+" "+Integer.toString(reverse,2));

	}

}
