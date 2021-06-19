package section2;




import java.util.*;

public class baekjoon_13305{
    public static void main(String[]args){
    Scanner sca=new Scanner(System.in);
        int count=sca.nextInt();
        int[] gas=new int[count];
        int[] d=new int[count-1];
        for(int i=0;i<count-1;i++){
            d[i]=sca.nextInt();
        }
        for(int i=0;i<count;i++){
            gas[i]=sca.nextInt();
        }
        int index=0;
        long sum=0;
        long min=0;
      
        for(int i=0; i<count-1;i++){
            if(i==0){
                min=gas[i];
                sum+=min*d[index];
                index++;
            }
            
            else if(min>gas[i]){
            	
            
            	min=gas[i];
            	sum+=min*d[index];
     
              
                index++;
            }
            else if(min<=gas[i]){
               sum+=min*d[index];
                index++;
            }
           
        }
        System.out.println(sum);
    }
    
}