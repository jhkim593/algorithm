package section2;


import java.util.*;

class baekjoon_11724{
    static int sum=0;
    public static void main(String[]args){
        
        Scanner sca=new Scanner(System.in);
        int node=sca.nextInt();
        int count=sca.nextInt();
        int []check=new int[node+1];
        sum=node;
        int [][]arr=new int[node+1][node+1];
        for(int i=0;i<count;i++){
            int a=sca.nextInt();
            int b=sca.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
        }
        for(int i=1;i<node+1;i++){
            if(check[i]==0)
                search(i,arr,check);
        }
        System.out.print(sum);
    }
    static void search(int a,int[][]arr,int []check){
        if(check[a]==1)return;
        check[a]=1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[a][i]==1&&check[i]==0){
                search(i,arr,check);
             sum--;
            }
        }
       
    }
}