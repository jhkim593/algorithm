package section2;


import java.util.*;

class Main{
     static int []arr;
    static int [][]check;
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
       
        arr=new int [num+1];
       check=new int[num+1][num+1];
        int count=sca.nextInt();
        for(int i=0;i<count; i++){
            int a=sca.nextInt();
            int b=sca.nextInt();
           check[a][b]=1;
            check[b][a]=1;
        }
      
       search(1);
     
   
    
        
    }
    static void search(int a){
     Queue<Integer>que=new LinkedList<Integer>();
     arr[a]=1;
     que.add(a);
        int sum=0;
        while(!que.isEmpty()){
            int b=que.poll();
            for(int i=0;i<arr.length;i++){
                if(check[b][i]==1&&arr[i]==0){
                    que.add(i);
                    sum++;
                    arr[i]=1;
                }
            }
        }
     System.out.print(sum);
        
       }
        
    }
   



//import java.util.*;
//
//class Main{
//    public static void main(String[]args){
//        Scanner sca=new Scanner(System.in);
//        int num=sca.nextInt();
//        int []arr=new int [num+1];
//        int [][]check=new int[num+1][num+1];
//        int count=sca.nextInt();
//        for(int i=0;i<count; i++){
//            int a=sca.nextInt();
//            int b=sca.nextInt();
//            check[a][b]=1;
//            check[b][a]=1;
//        }
//      
//       search(1,arr,check);
//     int sum=0;
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]==1){sum+=1;}
//    }
//    System.out.print(sum-1);
//        
//    }
//    static void search(int a,int[]arr,int[][]check){
//      if(arr[a]==1)return;
//      arr[a]=1;
//        for(int i=0;i<arr.length;i++){
//            if(check[a][i]==1&&arr[i]==0){
//                search(i,arr,check);
//            }
//        }
//    }
//   
//}