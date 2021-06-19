package section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class baekjoon_1966{
	
   

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Scanner;
	public class baekjoon_1966{
		
	   

		  public static void main(String[] args) {
		  Scanner sca = new Scanner(System.in);
			  int count=sca.nextInt();
			  int m=0;
			  int []target=new int[count];
			  List<List<Integer>>list=new ArrayList<List<Integer>>();
			  
			  for(int i=0;i<count; i++) {
				  int print=sca.nextInt();
				  int tar=sca.nextInt();
				  target[i]=tar;
				 
				  list.add(new ArrayList<Integer>());
				  for(int j=0;j<print;j++) {
					  int next=sca.nextInt();
					  list.get(i).add(next);
					 
				  }
			  }
			  for(int i=0;i<count;i++) {
				     LinkedList<Integer>qu=new LinkedList<>();
					 Queue<Integer>ta=new LinkedList<>();
				 for(int j=0;j<list.get(i).size();j++) {
					 
					 qu.add(list.get(i).get(j));
					 if(target[i]==j) {
						 ta.add(1);
					 }
					 else {
					 ta.add(0);}
				 }
				 while(true) {
				 int answer=qu.poll();
				 m++;
				 int tana=ta.poll();
				 for(int k=0;k<qu.size();k++) {
					 if(qu.get(k)>answer) {
						 m--;
						 qu.add(answer);
						 ta.add(tana);
						 answer=0;
						 tana=3;
						 break;
					 }
						 
					 }
				
				 if(tana==1&&answer!=0) {
					 System.out.println(m);
					 break;
				 }
				 
				 
				 }
				 m=0;
			  
			  
			  }
			 
	}
	}
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Scanner;
public class baekjoon_1966_1{
	public int solution(int[]A,int S) {
		
		
	}
}
	

		
	   




