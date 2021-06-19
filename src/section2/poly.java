package section2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
     public int solution(int n,int[][]orders) {
    	 int[][]temp=orders.clone();
    	 int answer=0;
    	 Arrays.sort(orders,(a1,a2)->{
    		  Map<String,Integer>map1=new HashMap<>();
    		  Math.max(1, 2);
    		 if(a1[1]==a2[1])return a1[0]-a2[0];
    		 return a2[1]-a1[1];
    	 });
    	 int num=0;
    	 int index=0;
    	 int cnt=0;
    	 int pass=0;
    	 for(int i=0;i<orders.length;i++) {
    		 
    		 int date=orders[i][0];
    		 int com=orders[i][1];
    		 num+=(date-cnt)*n;
    		 if(num>=com) {pass+=com;}
    		 if(temp[index][0]==date) {
    			 if(num>=temp[index][1]) 
    			 {
    				 if(pass<=temp[index][1]) {
    				 answer+=temp[index][1];num-=temp[index][1];
    			pass=0;}
    				 else{
    					 
    				answer+=pass; num-=pass;
    				pass=0;
    				 }
    			index++;	 
    			 }
    		 }
    		
    		 cnt=date;
    		 if(i==orders.length-1) {
    			 answer+=pass;
    		 }
    	 }
     }
}