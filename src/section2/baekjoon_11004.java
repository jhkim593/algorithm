package section2;


import java.util.*;
import java.io.*;
public class baekjoon_11004{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz=new StringTokenizer(br.readLine());
        int count=Integer.parseInt(stz.nextToken());
        int target=Integer.parseInt(stz.nextToken());
        int[]arr=new int [count];
        stz=new StringTokenizer(br.readLine());
        for(int i=0;i<count;i++){
            arr[i]=Integer.parseInt(stz.nextToken());
        }
        Arrays.sort(arr);
     
        System.out.print(arr[target-1]);
    }
}