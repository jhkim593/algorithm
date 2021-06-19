package section2;


import java.util.*;

public class baekjoon_1449{
    
    public static void main(String[]args){
        
        Scanner sca=new Scanner(System.in);
        int count=sca.nextInt();
        int t=sca.nextInt();
        int[]arr=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=sca.nextInt();
        }
        Arrays.sort(arr);
        int cur=0;
        int answer=0;
        for(int i=0;i<count;i++){
            if(i==0){cur=arr[i];answer++;}
            else{
                if(arr[i]-cur+1>t){
                    answer++;
                    cur=arr[i];
            }
        }
    }
        System.out.println(answer);
}
}