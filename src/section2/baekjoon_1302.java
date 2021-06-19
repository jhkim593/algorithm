package section2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class baekjoon_1302{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  
	  int count=sca.nextInt();
	  
	  List<String>list=new ArrayList<String>();
	  String[][]books=new String[count][2];
	  
	  int index=0;
	  for(int i=0;i<count;i++) {
		  String name=sca.next();
		  if(!list.contains(name)) {
			  list.add(name);
			  books[index][0]="1";
			  books[index][1]=name;
			  index++;
			  
		  }
		  else {
			  int num=list.indexOf(name);
			  String p=books[num][0];
			  int a=Integer.parseInt(p)+1;
			  books[num][0]=String.valueOf(a);
		  }
	  }
	  String[][] answer=new String[list.size()][2];
	  
	  for(int i=0;i<list.size();i++) {
		  answer[i][0]=books[i][0];
		  answer[i][1]=books[i][1];
	  }
	  Arrays.sort(answer,new Comparator<String[]>() {

		@Override
		public int compare(String[] o1, String[] o2) {
			if(Integer.parseInt(o1[0])==Integer.parseInt(o2[0])) {
				return o1[1].compareTo(o2[1]);
			}
			else {
		return 
			Integer.parseInt(o2[0])-Integer.parseInt(o1[0]);
			
		}
		}
	  });
	  System.out.println(answer[0][1]);
	  PriorityQueue<Integer>que=new PriorityQueue<Integer>();
	  que.
}
}

