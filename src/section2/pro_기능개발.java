package section2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class pro_기능개발{
	 
	 
	  public int[] solution(int[] progresses, int[] speeds) {
	        List<Integer>list=new ArrayList<Integer>();
	        int index=0;
	        int ans=0;
	        Queue<Integer>que=new LinkedList<>();
	        for(int i=0;i<progresses.length;i++) {
	        	que.add(progresses[i]);
	        }
	        while(!que.isEmpty()) {
	        	
	        	int a=que.peek();
	        	if(a>=100) {que.poll();ans++;index++;
	        	   if(que.isEmpty())list.add(ans);
	        	} 
	        	else {
	        		if(ans!=0) {list.add(ans);ans=0;}
	        		else {
	        		for(int i=index;i<progresses.length;i++) {
	        			int b=que.poll();
	        			b+=speeds[i];
	        			que.add(b);
	        		}
	        	}
	        	}
	        }
	        int []answer=new int[list.size()];
	        for(int i=0;i<list.size();i++) {
	        	answer[i]=list.get(i);
	        }
	       
	        return answer;
	    }
	 


	
   

	  public static void main(String[] args)  {
		 int[]c= {98,30,55};
		 int[]d= {1,30,5};
		 pro_기능개발 p=new pro_기능개발();
		 System.out.println(p.solution(c, d)[0]);
	  }
}
