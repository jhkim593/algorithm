package section2;


import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        StringBuilder st=new StringBuilder();
        for(int i=0;i<num;i++){
            int count=Integer.parseInt(br.readLine());
            StringTokenizer stz=new StringTokenizer(br.readLine());
            int []arr=new int[count];
            HashSet<Integer>list=new HashSet<Integer>();
            for(int j=0;j<count;j++){
                list.add(Integer.parseInt(stz.nextToken()));
            }
            int count2=Integer.parseInt(br.readLine());
            int []arr2=new int[count2];
            stz=new StringTokenizer(br.readLine());
            for(int j=0;j<count2;j++){
               int a=Integer.parseInt(stz.nextToken());
                if(list.contains(a)){st.append("1\n");}
                else{st.append("0\n");}
            }
                        
            
        }
        br.close();
       System.out.print(st);
       
        
}
}


//import java.util.*;
//import java.io.*;
//
//class Main{
//    
//    public static void main(String[]args)throws IOException{
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int num=Integer.parseInt(br.readLine());
//        StringBuilder st=new StringBuilder();
//        for(int i=0;i<num;i++){
//            int count=Integer.parseInt(br.readLine());
//            StringTokenizer stz=new StringTokenizer(br.readLine());
//            int []arr=new int[count];
//           
//            for(int j=0;j<count;j++){
//                arr[j]=Integer.parseInt(stz.nextToken());
//            }
//            int count2=Integer.parseInt(br.readLine());
//            int []arr2=new int[count2];
//            stz=new StringTokenizer(br.readLine());
//            for(int j=0;j<count2;j++){
//               int a=Integer.parseInt(stz.nextToken());
//                arr2[j]=a;
//            }
//             Arrays.sort(arr);
//           
//            for(int j=0;j<arr2.length;j++){
//            int mid=0;
//            int first=0;
//            int last=arr.length-1;
//             
//            while(first<=last){
//                mid=(first+last)/2;
//                if(arr[mid]==arr2[j]){st.append(1+"\n");break;}
//                else{
//                    if(arr[mid]>arr2[j]){
//                        last=mid-1;
//                    }
//                    else{
//                        first=mid+1;
//                    }
//                }
//            }
//            if(arr[mid]!=arr2[j]){st.append(0+"\n");}    
//        }
//            
//        }
//        br.close();
//        System.out.print(st);
//        
//}
//}