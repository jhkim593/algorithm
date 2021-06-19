package section2;


import java.util.*;
import java.io.*;
public class baekjoon_10815{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        StringBuilder stb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []arr=new int[count];
       
        for(int i=0;i<count;i++){
           arr[i]= Integer.parseInt(st.nextToken());
        
        	
        }
        count=Integer.parseInt(br.readLine());
        int []arr2=new int[count];
          st=new StringTokenizer(br.readLine());
        for(int i=0;i<count;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        	
        }
        br.close();
        Arrays.sort(arr);
      

 
     
        for(int i=0;i<arr2.length;i++){
        	int first=0;
            int mid=0;
            int last=arr.length-1;
            int check=0;
          while(first<=last) {
            mid=(first+last)/2;
            
            if(arr2[i]==arr[mid]) {stb.append("1 ");check++;break;}
            else {
            	if(arr2[i]>arr[mid]) {first=mid+1;}
            	else if (arr2[i]<arr[mid]){last=mid-1;}
            }
        }
          if(check==0)stb.append("0 ");
          
          }
       System.out.print(stb);
    }
}