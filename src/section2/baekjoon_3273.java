package section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class baekjoon_3273{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	StringTokenizer st=new StringTokenizer(br.readLine());
	int[]arr=new int[count];
	for(int i=0;i<count;i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
	int target=Integer.parseInt(br.readLine());
	
	Arrays.sort(arr);
	int max=0;
	int answer=0;
	int point=0;
	for(int i=0;i<count;i++) {
		if(arr[i]>=target) {max=i-1;point++;}	
		}
	if(point==0)max=count;

	
	for(int i=0;i<max-1;i++) {
		for(int j=i+1;j<max;j++) {
			if(arr[i]+arr[j]==target) {
				answer++;
			if(j!=max-1&&arr[j]!=arr[j+1]) break;
			
			
		}
			if(arr[i]+arr[j]>target) {break;}
	}
	
	  
	 }
	System.out.println(answer);
	}
}
//

