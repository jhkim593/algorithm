package section2;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class baekjoon_2828{
	
   

	  public static void main(String[]args){
	        Scanner sca=new Scanner(System.in);
	        int x=sca.nextInt();
	        int b=sca.nextInt();
	        int count=sca.nextInt();
	        int answer=0;
	        int []cur=new int[2];
	        cur[0]=1;cur[1]=b;
	        for(int i=0;i<count;i++){
	            int a=sca.nextInt();
	            if(a<cur[0]||a>cur[1]){
	                if(a>cur[1]){
	                    answer+=a-cur[1];
	                    cur[0]+=a-cur[1];
	                    cur[1]+=a-cur[1];
	                }
	                else if(a<cur[0]){
	                    answer+=cur[0]-a;
	                    cur[1]-=cur[0]-a;
	                    cur[0]-=cur[0]-a;
	                }
	            }
	           
	        }
	        System.out.println(answer);
	    }
	}