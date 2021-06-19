package section2;




import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import sun.misc.Queue;
public class baekjoon_3190x{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  int n=sca.nextInt();
	  int[][]array=new int[n][n];
//	  Queue<Integer[]>que=new LinkedList<Integer[]>();
	 
	  int apple=sca.nextInt();
	  List<int[]>appleList=new ArrayList<>();
	  
	  for(int i=0;i<apple;i++) {
		  int x=sca.nextInt();
		  int y=sca.nextInt();
		  int[]appleArray=new int[2];
		  appleArray[0]=x;
		  appleArray[1]=y;
		  appleList.add(appleArray);
	  }
	  int direct=sca.nextInt();
	  int[]directNum=new int[direct];
	  String[]directString=new String[direct];
	  for(int i=0;i<direct;i++) {
		  int num=sca.nextInt();
		  String s=sca.next();
		  directNum[i]=num;
		  directString[i]=s;
	  }
	  int sx=0;
	  int sy=0;
	  
	  while(true) {
		 
		 array[sx][sy]=1;
		 
		 for(int i=0;i<apple;i++) {
			 if(appleList.get(i)[0]==sx&&appleList.get(i)[1]==sy) {
				 
			 }
			 else
		 }
		  
	  }
	  
	  
}
}

