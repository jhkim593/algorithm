package section2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main_1{
	
    
       
   int target;
   int answer;

	  public static void main(String[] args) {
		  
		  Main_1 m=new Main_1();
		  int []aa= {2,5,3,8,1};
		  m.solution(aa,3 ,11);
	  }
	  
	 
	  public int solution(int []arr,int k ,int t) {
		  target=t;
		  for(int i=k;i<=arr.length;i++) {
			  int[]check=new int[arr.length];
			  ArrayList<Integer>temp=new ArrayList<>();
			  ArrayList<Integer>lll=temp.
			  dfs(check,arr,i,0,temp);
			  
		  }
		  return answer;
	  }
	      public void dfs(int []check,int[]arr,int len,int start,ArrayList<Integer>temp) {
	    	  if(len==temp.size()) {
	    		  int sum=0;
	    		  for(int i=0;i<temp.size();i++) {
	    			  sum+=temp.get(i);
	    			  
	    		  }
	    		  if(sum<=target) {answer+=1;}
	    		  return;
	    	  }
	    	  for(int j=start;j<arr.length;j++) {
	    		  if(check[j]==0) {
	    			  int []newcheck=check.clone();
	    			  newcheck[j]=1;
	    			  ArrayList<Integer>newtemp=new ArrayList<>();
	    			  newtemp.add(arr[j]);
	    			  dfs(newcheck,arr,len,j+1,newtemp);
	    		  }
	    	  }
	      }
	   

}



