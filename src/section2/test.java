package section2;

import java.util.Arrays;

public class test {
	
		public int[] solution(int[] answers) {
			
		int[] student1 = {1,2,3,4,5};
		int[] student2 = {2,1,2,3,2,4,2,5};
		int[] student3 = {3,3,1,1,2,2,4,4,5,5};
		int[] answerArr = {0,0,0};
		
		for(int i=0; i<answers.length;i++) {
			if(answers[i]==student1[i%5]) {answerArr[0]++;}
			if(answers[i]==student2[i%8]) {answerArr[1]++;}
			if(answers[i]==student3[i%10]) {answerArr[2]++;}
			
		}
		
		int []array=new int[3];
		for(int k=0;k<3;k++) {
			array[k]=answerArr[k];
		}
	
			
		Arrays.sort(answerArr);
		
		int arrayindex=1;
		
		for(int x=2; x<0; x--) {
			if(answerArr[2]==answerArr[x-1]) {
			
				arrayindex++;
				
			}
		}
		
		int []answer=new int[arrayindex];
		
		
		int index=0;
		
		for(int j=0;j<3;j++) {
			if(answerArr[2]==array[j]) {
				answer[index]=j+1;
				index++;
				
			}
							
		}
		return answer;
		
		
		}
		public static void main(String[] args) {
			
			
		}

}
