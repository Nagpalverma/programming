package geek_for_geeks;
import java.util.*;
public class find_single_element {
/*
 * find single element in array where other elements are repeated k times.
 * Note: if k is even then it is easily done by taking xor of each element and by property a^b^a=b
 * but for odd we have to do another approch
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(solution(arr,k));
	}
	
	static int solution(int arr[],int k)
	{
		int size=32;
		int[] count=new int[size];
		//increasing  ith position of count arr by no of set bits preset in elemnets
 //at that position
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if((arr[j]&(1<<i))!=0)
				count[i]++;
			}
		}
		//if apply mouler with k to count get the no
		int res=0;
		for(int i=0;i<size;i++)
			res+=(count[i]%k)*(1<<i);
		return res;
		
	}
	

}
