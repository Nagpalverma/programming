package LeetCode;

public class buy_sell_1_stock {
	/*
	 * we have to return max profit, not on which i purchase
	 */
	
	public static int[] solution(int[] arr)
	{
		int buy=Integer.MAX_VALUE;
		int profit=0 ,b=0;
		for(int i=0;i<arr.length;i++)
		{
			if(buy>arr[i])buy=arr[i];
			else if(profit<arr[i]-buy) { profit=arr[i]-buy;		
			b=buy;
			}
			}
		 int[] ans={b,profit};
		 return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {200,3,6,4,8,4,90,5,3,6,3,1};
		for(int i:solution(arr))
		System.out.println(i);
		
    
//		int c='3';
//	System.out.println(c);
	}

}
