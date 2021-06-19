package section2;

import java.util.*;

class baekjoon_11655{
    
    public static void main(String[]args){
        
        Scanner sca=new Scanner(System.in);
        StringBuilder st=new StringBuilder();
        String a=sca.nextLine();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='A'&&c<='Z'){
                if(c<=77)st.append((char)(c+13));
                else{
                    st.append((char)((c+13)-('Z'+1)+65));
                }
            }
            else if(c>='a'&&c<='z'){
                if(c<=109)st.append((char)(c+13));
                else st.append((char)(c+13-('z'+1)+'a'));
            }
            else{st.append(c);}
            }
        System.out.print(st);
        }
    }
