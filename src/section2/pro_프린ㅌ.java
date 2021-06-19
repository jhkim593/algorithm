package section2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class pro_프린ㅌ{
	 int a;
	 
	 public int solution(int[] priorities, int location) {
	        int answer = 0;
	        int []array=new int[priorities.length];
	        for(int i=0;i<priorities.length;i++) {
	        	array[i]=priorities[i];
	        }
	      
	       
	        Queue<Integer>que=new LinkedList<>();
	        for(int i=0;i<priorities.length;i++) {
	        	que.add(priorities[i]);
	        }
	        while(!que.isEmpty()) {
	        	
	         a=que.poll();
	        
	        Arrays.sort(array);
	        int max=array[array.length-1];
	        if(a==max) {
	        	array[array.length-1]=0;
	        	answer++;
	      
	        	if(location==0) {
	        		return answer;
                  
	        		
	        	}
	        	else {location--;}
	        }
	        
	        	
	        	
               
	        
	        
	        else {que.offer(a);location--;}
	        
	        if(location<0) {location=que.size()-1;}
	       
	        
	        
	        
        	
	        
	        }
	        
	        
	        return answer;
	    }

	
   

	  public static void main(String[] args)  {
		  int sam[]= {3,2,4,1,2,3,2,1,5,8,7};
		  int lo=2;
		  pro_프린ㅌ s=new pro_프린ㅌ();
		  System.out.println(s.solution(sam, lo));
		  
		  
	  }
}
