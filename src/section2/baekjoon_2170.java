package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
public class baekjoon_2170{
	
   
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	int[][]arr=new int[count][2];
	for(int i=0;i<count;i++) {
		StringTokenizer st=new StringTokenizer(br.readLine());
		arr[i][0]=Integer.parseInt(st.nextToken());
		arr[i][1]=Integer.parseInt(st.nextToken());
	}
	br.close();
	Arrays.sort(arr,new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			if(o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			
			return o1[0]-o2[0];
		}
		
	});
	int x=arr[0][0];
	int y=arr[0][1];
	int sum=y-x;
	for(int i=0;i<count-1;i++) {
		if(y>=arr[i+1][0]) {
			if(y<arr[i+1][1]){
			sum+=arr[i+1][1]-y;y=arr[i+1][1];}
			}
		else { x=arr[i+1][0];y=arr[i+1][1];sum+=y-x;}
	}
     System.out.println(sum);
	  
	   
	  }
	  
	 }



