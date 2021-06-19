package section2;


import java.util.*;

class baekjoon_7562{
    static int[]tx={-2,-1,1,2,  -2,-1,1,2};
    static int[]ty={1,2,2,1,    -1,-2,-2,-1};
        public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int count=sca.nextInt();
        
        for(int i=0;i<count;i++){
            int size=sca.nextInt();
            int check[][]=new int[size][size];
            Queue<int[]>que=new LinkedList<int[]>();
            int x=sca.nextInt();
            int y=sca.nextInt();
            int ax=sca.nextInt();
            int ay=sca.nextInt();
            check[x][y]=1;
            if(x==ax&&y==ay){
                System.out.println(0);
                continue;
            }
            que.add(new int[]{x,y,0});
            int sum=0;
            
            
            breakOUT:
            while(!que.isEmpty()){
                int[]a=que.poll();
                for(int j=0;j<8;j++){
                    int rx=a[0]+tx[j];
                    int ry=a[1]+ty[j];
                    if(rx>=0&&ry>=0&&rx<size&&ry<size){
                        if(check[rx][ry]==0){
                            if(rx==ax&&ry==ay){sum=a[2]+1;break breakOUT;}
                            que.add(new int[]{rx,ry,a[2]+1});check[rx][ry]=1;}
                    }
                }
              
            }
            System.out.println(sum);
            
        }
        
    }
}