package section2;


import java.util.*;

import java.util.*;


class baekjoon_2468{
    static int[]tx={-1,0,1,0};
    static int[]ty={0,1,0,-1};
 
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int size=sca.nextInt();
        int[][]arr=new int[size][size];
      
        int max=0;
        Queue<int[]>que=new LinkedList<int[]>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int a=sca.nextInt();
                arr[i][j]=a;
                if(max<a)max=a;
            }
        }
        int sum;
        int answer=0;
        for(int i=0;i<=max;i++){
            sum=0;
            int[][]check=new int[size][size];
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                   if(i<arr[j][k]&&check[j][k]==0){
                	   check[j][k]=1;que.add(new int[]{j,k});
                while(!que.isEmpty()){
                int []q=que.poll();
                for(int x=0;x<4;x++){
                    int rx=q[0]+tx[x];
                    int ry=q[1]+ty[x];
                    if(rx>=0&&ry>=0&&rx<size&&ry<size&&arr[rx][ry]>i){
                        if(check[rx][ry]==0){check[rx][ry]=1;que.add(new int[]{rx,ry});}
                    }
                }
            }  
                sum++;
                                   
                 } 
                }
            }
            if(answer<sum){answer=sum;}
            
           
        }
        System.out.print(answer);
    }
}