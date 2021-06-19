package section2;


import java.util.*;
import java.io.*;

class baekjoon_11497{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        StringBuilder st=new StringBuilder();
        for(int i=0;i<num;i++){
            int count=Integer.parseInt(br.readLine());
            StringTokenizer stz=new StringTokenizer(br.readLine());
            int []arr=new int[count];
            for(int j=0;j<count;j++){
                arr[j]=Integer.parseInt(stz.nextToken());
            }
            Arrays.sort(arr);
            int []newarr=new int[count];
           int index=0;
            for(int j=0;j<count;j++){
                if(j%2==0){
                    newarr[index]=arr[j];
                }
                else{
                    newarr[count-1-index]=arr[j];
                    index++;
                }
            }int max=0;
            for(int j=0;j<newarr.length-1;j++){
                if(Math.abs(newarr[j]-newarr[j+1])>max){max=Math.abs(newarr[j]-newarr[j+1]);}
            }
            st.append(max+"\n");
        }
        br.close();
        System.out.print(st);
        
}
}
