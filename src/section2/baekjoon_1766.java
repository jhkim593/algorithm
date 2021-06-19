package section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class baekjoon_1766{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  int number=sca.nextInt();
		  int count=sca.nextInt();
		  int []index=new int[number+1];
		  
		  List<List<Integer>> que = new ArrayList<List<Integer>>();
		  for(int i=0; i<number+1;i++) {
			  que.add(new ArrayList<Integer>());
		  }
		  
		  for(int i=0;i<count;i++) {
			 int x=sca.nextInt();
			 int y=sca.nextInt();
			 que.get(x).add(y);
			 index[y]++;
			 
		  }
		  
		  PriorityQueue<Integer> pq = new PriorityQueue<>();
		  for(int i=1; i<=number;i++) {
			  if(index[i]==0) {
				  pq.add(i);
			  }
		  }
		  while(!pq.isEmpty()) {
			  int answer=pq.poll();
			  for(Integer z:que.get(answer)) {
				  
					  index[z]--;
				  
				  if(index[z]==0) {
					  pq.add(z);
				  
				  }
			  }
			  System.out.println(answer+" ");
			  
		  }
		  
		  
		 
}
}



