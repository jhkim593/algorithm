package section2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class baekjoon_8979{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  
	  int count=sca.nextInt();
	  int[]arr=new int[count];
	 for(int i=0;i<count;i++) {
		 arr[i]=sca.nextInt();
	 }
	 Arrays.sort(arr);
	 int index=count;
	 int answer=arr[0]*index;
	 for(int i=1;i<count;i++) {
		 index--;
		if(answer<arr[i]*index) {answer=arr[i]*index;}
		
		 
	 }
	 System.out.println(answer);
			  
		
}
}

