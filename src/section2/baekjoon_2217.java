package section2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class baekjoon_2217{
	
   

	  public static void main(String[] args) {
	  Scanner sca = new Scanner(System.in);
	  
	  int count=sca.nextInt();
	  int target=sca.nextInt();
	  int[][] arr=new int[count][4];
	  int[][] rank=new int[count][2];
	  int index=1;
	  for(int i=0;i<count;i++) {
		  arr[i][3]=sca.nextInt();
		  arr[i][0]=sca.nextInt();
		  arr[i][1]=sca.nextInt();
		  arr[i][2]=sca.nextInt();
		  
	  }
	 

	  Arrays.sort(arr,new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			if(o1[0]==o2[0]) {
				if(o1[1]==o2[1]) {
					
						return o2[2]-o1[2];
					}
				else return o2[1]-o1[1];
				}
			else return o2[0]-o1[0];
			}
			
		});
	  rank[0][0]=1;
	  rank[0][1]=arr[0][3];
	  int range=0;
	  for(int i=0; i<count-1; i++) {
		  
		  if(arr[i][0]==arr[i+1][0]) {
			  if(arr[i][1]==arr[i+1][1]) {
				  if(arr[i][2]==arr[i+1][2]) {
					  rank[i+1][0]=index;
					  rank[i+1][1]=arr[i+1][3];
					  range++;
					 
				  }
				  else {index++;index+=range;rank[i+1][0]=index;rank[i+1][1]=arr[i+1][3];range=0; }
			  }
			  else { index++;index+=range;rank[i+1][0]=index;rank[i+1][1]=arr[i+1][3]; range=0;}
		  }
		  else {index++;index+=range;rank[i+1][0]=index;rank[i+1][1]=arr[i+1][3]; range=0;}
	  }
	 for(int i=0;i<rank.length;i++) {
		 if(target==rank[i][1]) {
			 System.out.println(rank[i][0]);
			 break;
		 }
	 }
}

}

