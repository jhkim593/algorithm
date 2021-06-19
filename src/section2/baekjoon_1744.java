package section2;


import java.util.*;
import java.io.*;

class baekjoon_1744{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int num=Integer.parseInt(br.readLine());
       PriorityQueue<Integer>listp=new PriorityQueue<Integer>(Collections.reverseOrder());
              PriorityQueue<Integer>listm=new PriorityQueue<Integer>();
        int index=0;
        for(int i=0;i<num;i++){
          int a=Integer.parseInt(br.readLine());
            if(a>0)listp.add(a);
            else if(a<0)listm.add(a);
            else index++;

        }
        
        int sum=0;
        
        while(!listm.isEmpty()){
            int a=listm.poll();
            if(!listm.isEmpty()){
                int b=listm.poll();
                sum+=a*b;
            }
            else{
                if(index==0) {sum+=a;}
            }
        }
        while(!listp.isEmpty()){
            int a=listp.poll();
             if(!listp.isEmpty()){
                int b=listp.poll();
                if(a*b>a+b) {
                    sum+=a*b;}
                    else {sum+=a+b;}
               
            }
            else{
            	sum+=a;
            }
        }
        
    System.out.print(sum);
    }
}