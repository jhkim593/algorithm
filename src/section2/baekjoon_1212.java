package section2;


import java.util.*;
import java.io.*;

class baekjoon_1212{
    
    public static void main(String[]args)throws IOException{
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String a=br.readLine();
//        long index=1;
//        long sum=0;
//        StringBuilder st=new StringBuilder();
//        for(int i=0;i<a.length();i++){
//            int temp=(a.charAt(i)-'0');
//            if(i==0){
//            	if(temp==0) {st.append("0");break;}
//             
//            else if(temp==1)st.append("1");
//                else if(temp==2)st.append("10");
//                else if(temp==3)st.append("11");
//                else if(temp==4)st.append("100");
//                else if(temp==5)st.append("101");
//                else if(temp==6)st.append("110");
//                else if(temp==7)st.append("111");
//                }
//            
//            else{
//                if(temp==0){st.append("000");}
//              else if(temp==1)st.append("001");
//                else if(temp==2)st.append("010");
//                else if(temp==3)st.append("011");
//                else if(temp==4)st.append("100");
//                else if(temp==5)st.append("101");
//                else if(temp==6)st.append("110");
//                else if(temp==7)st.append("111");
//                
//            }
//     
//        
//    }
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        long index=0;
        long sum=0;
        for(int i=a.length()-1;i>=0;i--){
            sum+=(a.charAt(i)-'0')*Math.pow(8,index);
            index++;
        }
        ArrayList<Long>list=new ArrayList<>();
        while(sum>1){
           long x=sum/2;
            long y=sum%2;
            list.add(y);
            sum=x;
        }
        System.out.print(sum);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
}

}