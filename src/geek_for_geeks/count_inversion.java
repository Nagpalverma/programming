package geek_for_geeks;

import java.util.Arrays;
//hello 

public class count_inversion {
//	 static long inversionCount(long arr[], long N)
//	    {
//	        return split(arr,0,(int)N-1);
//	    }
//	   
//	    public static long split(long[] arr,int start ,int  end)
//	    {
//	        if(start>=end) return 0;
//	        
//	          long count=0l;
//	          int mid=(start+end)/2;
//	        
//	        count+=split(arr,start,mid);
//	        count+=split(arr,mid+1,end);
//	        
//	        if(arr[mid]<arr[mid+1])return count;
//	        else count+=merge(arr,start,mid+1,end);
//	        return count;
//	        
//	        
//	    }
//	    public static long merge(long[] arr,int start,int mid,int end)
//	    {
//	        long count=0l;
//	        int i=start,j=mid,k=start;
//	        long[] aux=Arrays.copyOf(arr,arr.length);
//	        while(k<=end)
//	        {
//	        	 if(j>end)  arr[k++]=aux[i++];
//	        	 else if(i>=mid)  arr[k++]=aux[j++];
//	        	 else  if(aux[i]>aux[j]){
//	                count+=j-k;
//	                arr[k++]=aux[j++];
//	            }
//	           
//	            
//	            else            arr[k++]=aux[i++];
//	        }
//	        return count;
//	        
//	    }
//	    
	
	 static long inversionCount2(long[] arr,long N)
	 {
		 return sort(arr,0,(int)N-1);
		 
	 }
	 static long sort(long[] arr,int start,int end)
	 {
		 int count=0;
		 if(start>=end)return count;
		 int mid=start+(end-start)/2;
		 count+=sort(arr,start,mid);
		 count+=sort(arr,mid+1,end);
		 if(arr[mid]<arr[mid+1])
			 return count;
		 count+=merge(arr,start,mid+1,end);
		 return count;
	 }
	 
	 static long merge(long[] arr,int start,int mid,int end)
	 {
		 long[] left=Arrays.copyOfRange(arr, start, mid);
		 long[] right=Arrays.copyOfRange(arr, mid, end+1);
		 long count=0;
		 int i=0,j=0,k=start;
		 int ll=left.length,rl=right.length;
		 while(k<=end)
		 {
		 while(i<ll && j<rl)
		 {
			 if(left[i]>right[j])
				 {arr[k++]=right[j++];
				 count+=(mid)-(start+i);
				 }
			 else
				 arr[k++]=left[i++];
    	 }
		 if(i>=ll)arr[k++]=right[j++];
		 else if(j>=rl)arr[k++]=left[i++];
		 }
		 return count;
		 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr= {1,2,3,4,5,6,7,8,9,0};
		
			System.out.println(inversionCount2(arr,arr.length));
		

	}

}
