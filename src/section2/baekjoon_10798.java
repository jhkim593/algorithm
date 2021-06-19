package section2;



import java.util.*;
import java.io.*;

class baekjoon_10798{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st=new StringBuilder();
        char[][]arr=new char[5][15];
        HashMap<String,Integer>map=new HashMap<String,Integer>();
  
        for(int i=0;i<5;i++){
          
           
               String a=br.readLine();
            for(int j=0;j<a.length();j++){
               arr[i][j]=a.charAt(j);
            }
            
        }
       for(int i=0;i<15;i++){
           for(int j=0;j<5;j++){
               
               if(arr[j][i]=='\0'){continue;}
               System.out.print(arr[j][i]);
           }
       }
        
    }
}


