package section2;


import java.util.*;

class baekjoon_9093{
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int count= Integer.parseInt(sca.nextLine());
        String[]arr=new String[count];
        for(int i=0;i<count;i++){
           String c=sca.nextLine();
           arr[i]=c;
         
        }
      
        for(int i=0;i<count;i++){
            String[]b=arr[i].split(" ");
        
            for(int j=0;j<b.length;j++){
                StringBuilder st=new StringBuilder();
                for(int k=0;k<b[j].length();k++){
                    st.append(b[j].substring(b[j].length()-1-k,b[j].length()-k));
                }
                System.out.print(st+" ");
            }
            System.out.print("\n");
        }
    }
}