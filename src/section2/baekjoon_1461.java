package section2;


import java.util.*;

public class baekjoon_1461{
    
    public static void main(String[]args){
        Scanner sca= new Scanner(System.in);
        int count=sca.nextInt();
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer>mq=new PriorityQueue<Integer>();
        int answer=0;
        int max=0;
        int lim=sca.nextInt();
        
        for(int i=0;i<count;i++){
            int a=sca.nextInt();
            if(a>0) {pq.add(a);if(max<a)max=a;}
            else {mq.add(a);
                 }
            
        }
      if(pq.isEmpty()){max=Math.abs(mq.peek());}
       else if(!pq.isEmpty()&&!mq.isEmpty()){
           max=Math.max(Math.abs(mq.peek()),max);
       }
        while(!mq.isEmpty()){
            int a=mq.poll();
            for(int i=0;i<lim-1;i++){ 
                mq.poll();
                if(mq.isEmpty()){
                    break;
                }
                
            }
            answer+=-2*a;
        }
        
        while(!pq.isEmpty()){
            int a=pq.poll();
            for(int i=0;i<lim-1;i++){ 
               pq.poll();
                if(pq.isEmpty()){
                    break;
                }
                
        }
            answer+=2*a;
       
         
          
        }
        answer-=max;
        System.out.println(answer);
        
    }}
