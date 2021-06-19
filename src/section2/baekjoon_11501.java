package section2;


import java.util.*;

class baekjoon_11501{
    
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int count1=sca.nextInt();
        for(int i=0;i<count1;i++){
            int count2=sca.nextInt();
            long[]arr=new long[count2];
    
            for(int j=0;j<count2;j++) {
                arr[j]=sca.nextInt();
                
            }
         
            
            
            
            long cost=0;
          
            long max=0;
            for(int k=arr.length-1;k>=0;k--) {
               if(arr[k]>max) {max=arr[k];}
            
            else {
            	cost+=max-arr[k];
            }
         
            }
            System.out.println(cost);
    }
}}