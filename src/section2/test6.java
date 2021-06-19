package section2;

import java.util.Arrays;
class Solution {
	
	
	
	   public int[] solution(int[][] partTimeJobs, int[][] commands) {
		    int[] answer = new int[commands.length];
		   
		    int[]a=new int[commands.length];
		    for(int i=0;i<commands.length;i++) {
		    	int[]temp=Arrays.copyOfRange(partTimeJobs, commands[i][0]-1,commands[i][1]);
		    	Arrays.sort(temp);
		    	int an=temp[commands[i][2]-1];
		    	answer[i]=an;
		    }
		    
		    return answer;
		}
	 
	  public static void main(String[] args) {
			
			
			
	  }		
}


