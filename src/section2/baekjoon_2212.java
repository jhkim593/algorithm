package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
public class baekjoon_2212{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	int comm=Integer.parseInt(br.readLine());
	
	StringTokenizer st=new StringTokenizer(br.readLine());
	int[]arr=new int[count];
	Integer[]dif=new Integer[count-1];
	for(int i=0;i<count;i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
	
	Arrays.sort(arr);
	for(int i=0;i<count-1;i++) {
		dif[i]=arr[i+1]-arr[i];
	}
	Arrays.sort(dif, Collections.reverseOrder());
    if(count<=comm) {System.out.println(0);}
    else {
    	int answer=0;
    	for(int i=comm-1;i<dif.length;i++) {
    		answer+=dif[i];
    	}
    	System.out.println(answer);
    }

}}
//

