package section2;


import java.util.*;

public class baekjoon_1343{
    
    public static void main(String[]args){
        
        Scanner sca=new Scanner(System.in);
        String a=sca.next();
        StringBuilder st=new StringBuilder();
        int index=0;
        int breakPoint=0;
        String[]arr=a.split("");
        for(int i=0; i<arr.length;i++){
            if(arr[i].equals("X")){
                index++;
                if(index==4){
                    for(int j=0;j<4;j++){
                        arr[i-j]="A";
                    }
                    index=0;
                }
                if(i==arr.length-1) {
                	if(index==2) {
                		arr[i]="B";
                		arr[i-1]="B";
                	}
                	else if (index==3||index==1) {
                		breakPoint++;
                		break;
                	}
                }
        }
            else{
                if(index==2){
                    arr[i-1]="B";
                    arr[i-2]="B";
                }
                if(index==3||index==1){
                 breakPoint++;
                  break;
                }
                index=0;}
            
            
                
                
            }
        if(breakPoint==0) {
        for(int i=0;i<arr.length;i++){
            st.append(arr[i]);
        }
        System.out.print(st);
    }
        else {System.out.print(-1);}
        }
}