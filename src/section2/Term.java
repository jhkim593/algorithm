package section2;

import java.util.*;

class Term{
    
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        String a=sca.next();
        int index=0;
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
