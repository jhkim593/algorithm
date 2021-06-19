package section2;


import java.util.*;

public class baekjoon_2810{
    
    
    public static void main(String[]args){
        Scanner sca=new Scanner(System.in);
        int count=sca.nextInt();
        String a=sca.next();
        String[]arr=a.split("");
        
        int index=0;
        int point=0;
        int answer=0;
        int p=0;
        int cup=0;
        while(index<count){
            if(point==0){
                if(arr[index].equals("S")){
                    index++;
                    point++;
                    p++;
                    cup+=2;
                }
                else if(arr[index].equals("L")){
                    index+=2;
                    point++;
                    p+=2;
                    cup+=2;
                }
            }
            else{
                 if(arr[index].equals("S")){
                     index++;
                     p++;
                     cup++;
            }
                   else if(arr[index].equals("L")){
                       p+=2;
                       cup++;
                       index+=2;
                   }
        }
    }
       if(cup>=p){
           System.out.println(p);
       }
        else{
            System.out.println(cup);
        }
}
}