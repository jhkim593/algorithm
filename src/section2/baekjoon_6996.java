package section2;


import java.util.*;
import java.io.*;

class baekjoon_6996{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            StringTokenizer stz=new StringTokenizer(br.readLine());
            String x=stz.nextToken();
            String y=stz.nextToken();
            String[]a=x.split("");
            String[]b=y.split("");
            Arrays.sort(a);
            Arrays.sort(b);
            
            int check=0;
            if(a.length!=b.length){System.out.println(x+" & "+y+" are NOT anagrams.");}
            else{
                for(int j=0;j<a.length;j++){
                    if(!a[j].equals(b[j])){
                        check++;
                        System.out.println(x+" & "+y+" are NOT anagrams.");
                        break;
                    }
                }
                if(check==0){System.out.println(x+" & "+y+" are anagrams.");}  
            }
          
     
        }
       
        
}
}
