package section2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
public class baekjoon_2012{
	
   

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int count=Integer.parseInt(br.readLine());
	int[]arr=new int[count];
	for(int i=0;i<count;i++) {
		arr[i]=Integer.parseInt(br.readLine());
	}
	long sum=0;
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		int a=Math.abs((i+1)-arr[i]);
		sum+=a;
	}
	System.out.println(sum);
	
}}
//

