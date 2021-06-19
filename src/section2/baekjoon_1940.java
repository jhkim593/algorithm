package section2;


import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        int target=Integer.parseInt(br.readLine());
        int []arr=new int[count];
        List<Integer>list=new ArrayList<Integer>();
        StringTokenizer stz=new StringTokenizer(br.readLine());
        for(int i=0;i<count;i++){
            int a=Integer.parseInt(stz.nextToken());
            arr[i]=a;
            list.add(a);
        }
        br.close();
        if(!list.contains(target)){list.add(target);}
        Arrays.sort(arr);
        list.sort(null);
       
        int answer=0;
     
       int index=list.indexOf(target);
        for(int i=0;i<index-1;i++){
            for(int j=i+1;j<index;j++){
                if(arr[i]+arr[j]>target)break;
                else if(arr[i]+arr[j]==target){answer++;break;}
            }
        }
        System.out.print(answer);
        
}
}