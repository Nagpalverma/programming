package geek_for_geeks;

import java.util.*;

public class min_max {

	public static void main(String[] ejie)
	{
		Scanner sc=new Scanner(System.in);
	 int arr[]=new int[sc.nextInt()];
	 int j=0;
		while (j<arr.length)
		{
			arr[j++]=sc.nextInt();
		}
		
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min+"  "+max);
	}
}
