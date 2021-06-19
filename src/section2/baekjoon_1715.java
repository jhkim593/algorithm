package section2;




import java.util.*;


public class baekjoon_1715{
    
	  public static void main(String[]args){
	        Scanner sca=new Scanner(System.in);
	        int count=sca.nextInt();
	        PriorityQueue<Integer>que=new PriorityQueue<Integer>();
	        for(int i=0;i<count;i++){
	            int a=sca.nextInt();
	           
	            que.add(a);
	        }
	       
	        int sum=0;
	        if(que.size()==1) {
	        	System.out.print(0);
	        }
	        else {
	        while(!que.isEmpty()){
	            int a=que.poll()+que.poll();
	            sum+=a;
	            if(!que.isEmpty()) {
	            que.add(a);}
	        }
	        System.out.println(sum);
	    }
	}}