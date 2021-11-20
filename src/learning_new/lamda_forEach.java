package learning_new;
import java.util.*;

public class lamda_forEach implements Iterable<Integer> {
	int[] arr= {1,2,3,4,5};
	int i=0,len=arr.length;

	public static void main(String[] args) {
		
//		//1
//		ArrayList<Integer> aa=new ArrayList<>();
//		aa.add(2);
//		Iterator<Integer> i=aa.iterator();
//		while(i.hasNext())
//			System.out.println(i.next());
//		for(Integer k:aa)
//			System.out.println(k);
		
		
		
		
		lamda_forEach all=new lamda_forEach();
	Iterator<Integer> i=all.iterator();
	while(i.hasNext()) 
	System.out.println(i.next());
	
	
		



}

	@Override
	public Iterator<Integer> iterator() {
		
	
		// TODO Auto-generated method stub
		Iterator<Integer> aa=new Iterator<>()
				{

					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						if(i<len)return true;
						return false;
					}

					@Override
					public Integer next() {
						// TODO Auto-generated method stub
						
						return arr[i++];
					}
			
				};
		return aa;
	}
}
