package LeetCode;
import java.util.*;
public class sliding_window {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int index=1;
        ArrayDeque<Integer> window=new ArrayDeque<>();
        
        for(int i=0;i<k;i++)
        {
            if(window.isEmpty())
                window.add(i);
            else
            { while(!window.isEmpty()&&nums[window.peekLast()]<nums[i])window.removeLast();
                window.addLast(i);
            }
        }
        int length=nums.length;
        int[] ans=new int[length-k+1];
        ans[0]=nums[window.peekFirst()];
        for(int j=k;j<length;j++)
        {
            if(window.peekFirst()<index)window.removeFirst();
            while(!window.isEmpty()&& nums[window.peekLast()]<nums[j])window.removeLast();
            window.addLast(j);
            ans[index++]=nums[window.getFirst()];
        }
        return ans;
        
    }
    
    public static void main(String[] args)
    {
    	int[] arr= {1,3,1,2,0,5};
    	int[] ans=maxSlidingWindow(arr,3);
    	for(int i:ans)
    		System.out.print(" "+i);
    }
    
  /*
   *    ArrayDeque<Integer> window=new ArrayDeque<>();
        int length=nums.length,index=0;
        int[] ans=new int[length-k+1];
      for(int i=0;i<length;i++)
      {
          if(!window.isEmpty() && window.peek()<=i-k)window.removeFirst();
          while(!window.isEmpty() && nums[window.getLast()]<nums[i])window.removeLast();
          window.add(i);
          if(i>=k-1)
              ans[index++]=nums[window.peek()];
      }
        return ans;
   */
    
    
}
