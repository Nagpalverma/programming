package geek_for_geeks;

public class three_wy_partition {

	 public static void threeWayPartition(int array[], int a, int b)
	    {
	        
	        int i=0,j=array.length-1;
	        for(int k=0;k<j && i<j;k++ )
	        {
	            if(array[k]<a)
	            swap(array,k++,i++);
	            
	            else if(array[k]>b)swap(array,k--,j--);
	        }
	    }
	    public static void swap(int[] arr,int i,int j)
	    {
	        int tem=arr[i];
	        arr[i]=arr[j];
	        arr[j]=tem;
	    }
	    
	    public static void main(String[] bhjfbj)
	    {
	    	int[] arr= {87,78,16,94};
	    	threeWayPartition(arr,36,72);
	    	for(int i:arr)
	    		System.out.println(i);
	   }
}
