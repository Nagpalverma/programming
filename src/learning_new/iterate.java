package learning_new;

import java.util.*;

public class iterate implements Iterator<Integer> {
	int[] arr= {1,2,3,4,5};
	int i=0,len=arr.length;
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Random r=new Random();
		for(int i=0;i<10;i++)
			{double d=Math.random()*(100-50+1)+50;
			System.out.print(" "+d);
			
			}
			
		
		
	}

	@Override
	public boolean hasNext() {
		
		if(i<len)return true;
		return false;
	}

	@Override
	public Integer next() {
		
		return arr[i++];
		
		
	}

}
