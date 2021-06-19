package section2;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class baekjoon_4949{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
		  
		  List<String[]> que = new ArrayList<String[]>();
		 
		  while(true) {
			  String array=sca.nextLine();
			  if(array.equals("."))break;
			  String[]n=array.split("");
			  que.add(n);
		  }
		  for(int i=0;i<que.size();i++) {
			  int size=0;
			  String[]stack=new String[que.get(i).length];
			  int breakPoint=0;
			 
			  for(int j=0;j<que.get(i).length;j++) {
				  if(que.get(i)[j].equals("(")||que.get(i)[j].equals("[")) {
					  stack[size]=que.get(i)[j];
					  size++;
				  }
				  else if(que.get(i)[j].equals("]")) {
					  if(size==0||!stack[size-1].equals("[")) {breakPoint++;break;}
					  else size--;
				  }
				  else if(que.get(i)[j].equals(")")) {
					  if(size==0||!stack[size-1].equals("(")) {breakPoint++;break;}
					  else size--;
				  
			  }
				 
			
			 
			  
			  
		  }
			 if(breakPoint==0) {
				  
			   if(size==0) {
				 System.out.println("yes");
			   }
			   else System.out.println("no");}
			  
			  else {
				System.out.println("no");
			}
			  
			  
		  }
		  
//		 
	  
}
}

