package section2;


import java.util.*;
import java.io.*;

class baekjoon_1159{
    
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        String[]arr=new String[26];
        int[]arr2=new int[26];
        StringBuilder st=new StringBuilder();
        for(int i=0;i<count;i++){
            String a=br.readLine();
            String b=a.substring(0,1);
            arr[a.charAt(0)-'a']=b;
           arr2[a.charAt(0)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(arr2[i]>=5){st.append(arr[i]);}
        }
        if(st.length()==0){
            System.out.print("PREDAJA");
        }
        else{
            System.out.print(st);
        }
    }
}