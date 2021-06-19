package section2;


import java.util.*;

public class baekjoon_15903{
    
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        PriorityQueue<Long>que=new PriorityQueue<Long>();
        int count=sca.nextInt();
        int sh=sca.nextInt();
        for(int i=0;i<count;i++){
          que.add(sca.nextLong());
        }
        for(int i=0;i<sh;i++){
            long sum=que.poll()+que.poll();
            que.add(sum);
            que.add(sum);
        }
        long answer=0;
        int size=que.size();
        for(int i=0;i<size;i++){
            answer+=que.poll();
        }
        System.out.println(answer);
    }
}