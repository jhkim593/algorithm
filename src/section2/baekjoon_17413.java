package section2;


import java.util.*;
import java.io.*;


class baekjoon_17413{
    
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String[] b=a.split(" ");
        StringBuilder st=new StringBuilder();
        int check=0;
        for(int i=0;i<b.length;i++){
            List<String>list=new ArrayList<String>();
            int index=0;
            for(int j=0;j<b[i].length();j++){
            
            if(b[i].substring(j,j+1).equals("<")){
            	int num=index;
                for(int k=0;k<num;k++){
                st.append(list.get(list.size()-1-k));index--;
            }
                
                check++;st.append("<");}
            else if(b[i].substring(j,j+1).equals(">")){check--;st.append(">");}
            else if(check==1){st.append(b[i].substring(j,j+1));}
            else if(check==0){
                list.add(b[i].substring(j,j+1));index++;
            }
            }
            if(index!=0) {
            	int num=index;
            for(int j=0;j<num;j++){
                st.append(list.get(list.size()-1-j));
            }
            }
            st.append(" ");
        }
        System.out.print(st);
        
    }
}




//import java.util.*;
//import java.io.*;
//
//
//class tttd{
//    
//    public static void main(String[]args)throws IOException{
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String a=br.readLine();
//        String[] b=a.split(" ");
//        StringBuilder st=new StringBuilder();
//        int check=0;
//        for(int i=0;i<b.length;i++){
//  
//      
//            String word="";
//            for(int j=0;j<b[i].length();j++){
//            
//            if(b[i].substring(j,j+1).equals("<")){
//            	st.append(word);
//            	word="";
//            	check++;st.append("<");
//            }
//                
//                
//            else if(b[i].substring(j,j+1).equals(">")){check--;st.append(">");}
//            else if(check==1){st.append(b[i].substring(j,j+1));}
//            else if(check==0){
//               word=b[i].substring(j,j+1)+word;
//            }
//            }
//            if(!word.isEmpty()) {
//           st.append(word);
//            
//            }
//            st.append(" ");
//        }
//        System.out.print(st);
//        
//    }
//}