package section2;


import java.util.*;
import java.io.*;

class baekjoon_2473x{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
       int num=Integer.parseInt(br.readLine());
       ArrayList<Integer>listp=new ArrayList<Integer>();
      ArrayList<Integer>listm=new ArrayList<Integer>();
        StringTokenizer stz=new StringTokenizer(br.readLine());
       for(int i=0;i<num;i++){
           int a=Integer.parseInt(stz.nextToken());
           if(a>0){listp.add(a);}
           else{listm.add(a);}
       }
        if(listp.isEmpty()){listm.sort(Collections.reverseOrder());
                                      System.out.print(listm.get(0)+listm.get(1)+listm.get(2));}
        else if(listm.isEmpty()){listp.sort(null);System.out.print(listp.get(0)+listp.get(1)+listp.get(2));}
        else{
            
            
        }
    }
}