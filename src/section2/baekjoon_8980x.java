package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class baekjoon_8980x{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer(br.readLine());
	
	int home=Integer.parseInt(st.nextToken());
	int limit=Integer.parseInt(st.nextToken());
	int count=Integer.parseInt(br.readLine());
	int[][]arr=new int[count][3];
	for(int i=0;i<count;i++) {
		StringTokenizer st1=new StringTokenizer(br.readLine());
		arr[i][0]=Integer.parseInt(st1.nextToken());
		arr[i][1]=Integer.parseInt(st1.nextToken());
		arr[i][2]=Integer.parseInt(st1.nextToken());
	}
	Arrays.sort(arr,new Comparator<int[]>() {

		@Override
		public int compare(int[] arg0, int[] arg1) {
			if(arg0[1]==arg1[1]) {
				return arg0[0]-arg1[0];
			}
			return arg0[1]-arg1[1];
		}
		
	});
	int index=1;
	int kg=0;
	for(int i=0; i<count;i++) {
		if(index==arr[i][0]) {
		if(kg+arr[i][2]<=limit) {
			kg+=arr[i][2];
		}
		
		
	}
		else {index++;continue;}

	}
}}
//

