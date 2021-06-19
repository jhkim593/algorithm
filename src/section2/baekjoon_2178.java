package section2;


import java.util.*;
class baekjoon_2178{
    
static int[]tx={-1,0,0,1};
static int[]ty={0,1,-1,0};
 public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int x=sca.nextInt();
        int y=sca.nextInt();
        sca.nextLine();
     int[][]arr=new int[x][y];
     int[][]check=new int[x][y];
     Queue<int[]>que=new LinkedList<int[]>();
     que.add(new int[]{0,0});
     check[0][0]=1;
     
     for(int i=0;i<x;i++){
           String[]a=sca.nextLine().split("");
         for(int j=0;j<y;j++){
        
             arr[i][j]=Integer.parseInt(a[j]);
             
         }
     }
     int answer=0;
     breakOut:
        while(!que.isEmpty()){
            int[]q=que.poll();
            for(int i=0;i<4;i++){
                int rx=q[0]+tx[i];
                int ry=q[1]+ty[i];
                
                if(rx>=0&&ry>=0&&rx<x&&ry<y&&arr[rx][ry]==1){
                    if(rx==x-1&&ry==y-1){answer=check[q[0]][q[1]]+1;break breakOut;}
                    if(check[rx][ry]==0){check[rx][ry]=check[q[0]][q[1]]+1;que.add(new int[] {rx,ry});}
                }
            }
            
        }
        System.out.print(answer);
        String z="ss";
        
        
        
        
    }
}