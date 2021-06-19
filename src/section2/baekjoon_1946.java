package section2;


import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer>que=new LinkedList<Integer>();
        int num=Integer.parseInt(br.readLine());
        for(int k=0;k<num;k++) {
        int count=Integer.parseInt(br.readLine());
        int[][]arr=new int [count][2];
     
        for(int i=0;i<count;i++){
            StringTokenizer stz=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(stz.nextToken());
            int a=Integer.parseInt(stz.nextToken());
            arr[i][1]=a;
            que.add(a);
            
        }
        Arrays.sort(arr,new Comparator<int[]>() {
        	public int compare(int[]a,int[]b) {
        		return b[0]-a[0];
        	}
        });
        int answer=1;
        int max=arr[0][1];
        for(int i=1;i<arr.length;i++){
           if(arr[i][1]<max) {
        	   answer++;
        	   max=arr[i][1];
           }
            
        }
        System.out.println(answer);
        }
}
}