package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
public class baekjoon_2548{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	StringBuilder st1=new StringBuilder();
	StringTokenizer st=new StringTokenizer(br.readLine());
	int[]arr=new int[count];
	for(int i=0;i<count;i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
	Arrays.sort(arr);
	int index=0;
	if(count%2==0) {
		index=count/2;
	}
	else {
		index=count/2+1;
	}
	System.out.println(arr[index-1]);
}}
//

