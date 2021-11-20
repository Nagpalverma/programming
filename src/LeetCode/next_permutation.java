package LeetCode;

public class next_permutation {
	static int[] solution(int[] a)
	{
		int length=a.length, start=-1,end=-1;
		
		for(int i=length-2;i>=0;i--)
			if(a[i]<a[i+1]) {
				start=i;break;}
			
		if(start<0)
			{reverse(a,0,length-1);
			return a;
			}
		
		for(int i=length-1;i>start;i--)
			if(a[start]<a[i]) {end=i;break;}
		sawp(a,start,end);
		reverse(a,start+1,length-1);
		
		return a;
		
	}
	static void reverse(int[] arr,int i,int j)
	{
		while(i<j)
			sawp(arr,i++,j--);
	}
	static void sawp(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] aaaa)
	{
		int[] arr= {1,2,3};
		for(int i:solution(arr))
		System.out.print(" "+i);
	}
}
