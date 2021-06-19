package section2;


import java. util.*;

class baekjoon_2644{
    static int[][]arr;
    static int[]check;
    static int an=0;
    public static void main(String[]args){
        
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
        int first=sca.nextInt();
        int target=sca.nextInt();
        int count= sca.nextInt();
        arr=new int[num+1][num+1];
        check=new int[num+1];
        for(int i=0;i<count;i++){
            int a=sca.nextInt();
            int b=sca.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
            
        }
        search(first,0,target);
        if(an==0) {System.out.println(-1);}
        else {System.out.println(an);}
        
    }
    
    static void search(int first,int sum,int target){
        check[first]=1;
      
        for(int i=0;i<arr.length;i++){
           
            
            if(arr[first][i]==1&&check[i]==0){
                   
            	if(i==target) {an=sum+1;return;}
                
                search(i,sum+1,target);
               
            }
            
        }
    }
}