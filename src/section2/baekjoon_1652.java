package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class baekjoon_1652{
    
    public static void main(String[]args) throws  IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int count=Integer.parseInt(br.readLine());
        char[][]arr=new char[count][count];
        StringBuilder st=new StringBuilder();
       
        for(int i=0;i<count;i++){
         arr[i]=br.readLine().toCharArray();
            
        }
        br.close();
        int wsum=0;
        int dsum=0;
        int wbreakPoint=0;
        int dbreakPoint=0;
        int w=0;
        int d=0;
        for(int i=0;i<count;i++){
            wbreakPoint=0;
            dbreakPoint=0;
            wsum=0;
            dsum=0;
            for(int j=0;j<count;j++){
                if(arr[i][j]=='.'){wsum++;}
                   else{wsum=0;wbreakPoint=0;}
                   if(wsum>=2&&wbreakPoint==0){w++;wbreakPoint++;}
                   
                   if(arr[j][i]=='.'){dsum++;}
                   else{dsum=0;dbreakPoint=0;}
                   
                   if(dsum>=2&&dbreakPoint==0){d++;dbreakPoint++;}
                
            }
            
        }
      
       
    
        System.out.print(w+" "+d);
        
    }
}