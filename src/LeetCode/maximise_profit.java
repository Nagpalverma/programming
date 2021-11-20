package LeetCode;

public class maximise_profit {
	
	 public static int maxProfit(int[] prices) {
	        
	        int buy=Integer.MAX_VALUE;
	        int sum=0;
	        for(int i=0;i<prices.length;i++)
	        {
	            if(buy<prices[i])buy=prices[i];
	            else{             
	                sum+=prices[i]-buy;
	                buy=prices[i];
	                 }
	        }
	        return sum;
	        
	    }

	public static void main(String[] args) {

		int[] arr= {7,1,5,3,6,4};
System.out.println(maxProfit(arr));
	}

}
