package section2;


import java.util.*;

class Main{
    static int[]dx={1,0,1,-1, 0,-1,-1, 1};
    static int[]dy={0,1,1, 0,-1,-1, 1,-1};
    public static void main(String[]args){
        
        Scanner sca=new Scanner(System.in);
     
       
        
        while(true){
            int b=sca.nextInt();
            int a=sca.nextInt();
            if(a==0&&b==0)break;
            int [][]arr=new int[a][b];
            int[][]check=new int[a][b];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    arr[i][j]=sca.nextInt();
                }
            }int sum=0;
               
           for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if(check[i][j]==0&&arr[i][j]==1){
                    search(i,j,arr,check);
                    sum++;}
                }
            }
            System.out.println(sum);
        }
    }
    static void search(int i,int j,int[][]arr,int[][]check){
        if(check[i][j]==1)return;
        check[i][j]=1;
        //if(i+1<arr.length){if(check[i+1][j]==0&&arr[i+1][j]==1){search(i+1,j,arr,check);}}
        //if(j+1<arr[0].length){if(check[i][j+1]==0&&arr[i][j+1]==1){search(i,j+1,arr,check);}}
        //if(i-1>=0){if(check[i-1][j]==0&&arr[i-1][j]==1){search(i-1,j,arr,check);}}
        //if(j-1>=0){if(check[i][j-1]==0&&arr[i][j-1]==1){search(i,j-1,arr,check);}}
        //if(j+1<arr[0].length&&i+1<arr.length){if(check[i+1][j+1]==0&&arr[i+1][j+1]==1){search(i+1,j+1,arr,check);}}
        //if(i-1>=0&&j-1>=0){if(check[i-1][j-1]==0&&arr[i-1][j-1]==1){search(i-1,j-1,arr,check);}}
        //if(i-1>=0&&j+1<arr[0].length&&check[i-1][j+1]==0&&arr[i-1][j+1]==1) {search(i-1,j+1,arr,check);}
        //if(i+1<arr.length&&j-1>=0&&check[i+1][j-1]==0&&arr[i+1][j-1]==1) {search(i+1,j-1,arr,check);}
        
        for(int k=0;k<8;k++){
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0&&y>=0&&x<arr.length&&y<arr[0].length){
                if(check[x][y]==0&&arr[x][y]==1){
                    search(x,y,arr,check);
                }
            }
        }
    }
    
}




//import java.util.*;
//
//class Main{
//    static int[]dx={1,0,1,-1, 0,-1,-1, 1};
//    static int[]dy={0,1,1, 0,-1,-1, 1,-1};
//    static int [][]arr;
//    static int[][]check;
//    static Queue<p>que=new LinkedList<p>();
//    public static void main(String[]args){
//        
//        Scanner sca=new Scanner(System.in);
//       
//        while(true){
//            int b=sca.nextInt();
//            int a=sca.nextInt();
//            if(a==0&&b==0)break;
//            arr=new int[a][b];
//            check=new int[a][b];
//            
//            for(int i=0;i<a;i++){
//                for(int j=0;j<b;j++){
//                    arr[i][j]=sca.nextInt();
//                }
//            }int sum=0;
//               
//           for(int i=0;i<a;i++){
//                for(int j=0;j<b;j++){
//                    if(check[i][j]==0&&arr[i][j]==1){
//                    search(i,j);
//                    sum++;}
//                }
//            }
//            System.out.println(sum);
//        }
//    }
//    static void search(int x,int y){
//    que.add(new p(x,y));
//        check[x][y]=1;
//      while(!que.isEmpty()){
//            p p1=que.poll();
//            
//            for(int i=0;i<8;i++){
//                int a=p1.x+dx[i];
//                int b=p1.y+dy[i];
//                if(a>=0&&b>=0&&a<arr.length&&b<arr[0].length){
//                    if(check[a][b]==0&&arr[a][b]==1){
//                        que.add(new p(a,b));
//                        check[a][b]=1;
//                    }
//                }
//            }
//        }
//    
//}
//}
//class p{
//    int x;
//    int y;
//    p(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//}