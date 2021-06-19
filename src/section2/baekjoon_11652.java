package section2;


import java.util.*;
import java.io.*;

class baekjoon_11652{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        Map<Long,Integer>map=new HashMap<Long,Integer>();
        for(int i=0;i<num;i++){
          long a=Long.parseLong(br.readLine());
            if(map.containsKey(a)){int cur=map.get(a);map.put(a,cur+1);}
            else{map.put(a,1);}
        }
        Iterator<Long>it=map.keySet().iterator();
        long[]arr=new long [map.size()];
        int index=0;
        while(it.hasNext()){
            arr[index]=it.next();
            index++;
        }
        Arrays.sort(arr);
        long max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(map.get(arr[i])>map.get(max)){max=arr[i];}
        }
        System.out.print(max);
    }
}