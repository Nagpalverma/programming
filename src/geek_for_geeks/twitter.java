package geek_for_geeks;
import java.util.*;
public class twitter {
	
	
	  public static List<String> processLogs(List<String> logs, int maxSpan) {
		    // Write your code here
		    LinkedList<Integer> ans=new LinkedList<>();
		    HashMap<Integer,Integer> table=new HashMap<>();
		    int n=logs.size();
		    if(n<1)return null;
		    
		    for(String s:logs)
		    {
		        int x=s.indexOf(" ");
		        int y=s.indexOf(" ", x+1);
		        int id=Integer.parseInt(s.substring(0,x));
		        int time=Integer.parseInt(s.substring(x+1,y));
		        int op=s.substring(y+1).equals("sign-out")?1:0;
		        if(op==0)
		          table.put(id, time);
		          else
		          {
		              int span=time-table.get(id);
		              if(span<=maxSpan)
		            ans.add(id);
		          }
		    }
		    
		    Collections.sort(ans);
		    List<String> ans2=new LinkedList<>();
		    for(Integer i:ans)
		    ans2.add(Integer.toString(i));
		    return ans2;
		    

		    }

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> agag=new HashMap<>();
System.out.println(agag.get(9));		

	}

}
