package section2;


import java.util.*;

public class baekjoon_1032{
    
    public static void main(String[]args){
        
    
        Scanner sca=new Scanner(System.in);
       StringBuilder st=new StringBuilder();
        int count=sca.nextInt();
        String[] a=new String[count];
   
        for(int i=0;i<count;i++){
            String b=sca.next();
            a[i]=b;
           
           
           
        }
        int breakPoint=0;
        for(int i=0;i<a[0].length();i++){
            String tar=a[0].substring(i,i+1);
                  
            for(int j=0; j<count;j++){
                if(!a[j].substring(i,i+1).equals(tar)){st.append("?");breakPoint++;break;}
            }
            if(breakPoint==0){
                st.append(tar);
            }
            breakPoint=0;
        }
        System.out.print(st);
    }
}