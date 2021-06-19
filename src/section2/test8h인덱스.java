package section2;

import java.util.Arrays;
import java.util.Comparator;
class test8h인덱스{
	
    public int solution2(int[] citations) {
        int answer = 0;
        int a=0;
        int b=0;
        Arrays.sort(citations);
       for(int i=0;i<=citations.length;i++) {
    	   for(int j=0;j<citations.length;j++) {
    	   if(citations[j]>=i)a++;
    	   if(citations[j]<=i)b++;
    	   }
    	  
    		   if(a>=i&&b<=i) {
    			  if(answer<i) {
    				  answer=i;
    			  }
    		   }
    		  a=0;b=0;
    	   }
       return answer;
       }
       
        
       
    

	  public static void main(String[] args) {
		int []a= {22,42};
		test8h인덱스 s=new test8h인덱스();
		System.out.println(s.solution2(a));
			
	  }		
}



