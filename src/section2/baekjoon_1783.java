package section2;


import java.util.*;

public class baekjoon_1783{
    
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int y=sca.nextInt();
        int x=sca.nextInt();
      
        if(y==1) {
        	System.out.print(1);
        }
        if(y==2) {
        	if(x<=8) {
        	if(x%2==0) {
            	System.out.print(x/2);

        	}
        	else { System.out.print(x/2+1);
}
        	}
        	else {        	System.out.print(4);
}
        }
        if(y>2) {
        	if(x<=4) {
        		System.out.print(x);
        	}
        	else if(x==5) {
        		System.out.print(4);
        	}
        	else if(x>5) {System.out.print(x-2);}
        }
    }
}